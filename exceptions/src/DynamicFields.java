import java.util.PropertyResourceBundle;

/**
 * @author 刘季伟
 * @implNote 展示如何在运行时动态地向DynamicFields 对象添加字段
 * @since 2024/7/18 12:19:35
 */
class DynamicFieldsException extends Exception {}
public class DynamicFields {
    private Object[][] fields;
    public DynamicFields(int initialSize){
        fields = new Object[initialSize][2];
        for (int i = 0; i < initialSize; i++){
            fields[i] = new Object[] {null, null};
        }
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (Object[] obj : fields){
            result.append(obj[0]);
            result.append(": ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }

    private int hasField(String id){
        for (int i = 0; i < fields.length; i++){
            if (id.equals(fields[i][0])){
                return i;
            }
        }
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchFieldException{
        int fieldNum = hasField(id);
        if (fieldNum == -1)
            throw new NullPointerException();
        return fieldNum;
    }

    private int makeField(String id){
        for (int i = 0; i < fields.length; i++)
            if (fields[i][0] == null){
                fields[i][0] = id;
                return i;
            }
        // 如果没有空的fields，就添加一个
        Object[][] tmp = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; i++){
            tmp[i] = fields[i];
        }
        for (int i = fields.length; i < tmp.length; i++){
            tmp[i] = new Object[] {null, null};
        }
        fields = tmp;

        return makeField(id);
    }

    public Object getField(String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object value) throws DynamicFieldsException{
        if (value == null){
            // 大多数的异常没有“cause”构造器，因此在这种情况下必须要使用initCause()，该方法对于所有派生自Throwable的子类都适用
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }
        int fieldNumber = hasField(id);
        if (fieldNumber == -1){
            fieldNumber = makeField(id);
        }
        Object result = null;
        try {
            result = getField(id); // 得到旧的值
        } catch (NoSuchFieldException e){
            // 使用接收“cause”参数的构造器
            throw new RuntimeException(e);
        }
        fields[fieldNumber][1] = value;
        return result;
    }

    public static void main(String[] args) {
        DynamicFields df = new DynamicFields(3);
        System.out.println(df);
        try {
            df.setField("d", "A value for d");
            df.setField("number", 47);
            df.setField("number2", 48);
            System.out.println(df);
            df.setField("d", "A new value for d");
            df.setField("number3", 11);
            System.out.println("df.getField(\"d\")" + df.getField("d"));
            Object field = df.setField("d", null); // 异常
        } catch (NoSuchFieldException | DynamicFieldsException e){
            e.printStackTrace(System.out);
        }
    }

}
