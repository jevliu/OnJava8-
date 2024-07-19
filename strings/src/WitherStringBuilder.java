/**
 * @author 刘季伟
 * @implNote 展示StringBuilder的基本用法
 * @since 2024/7/19 11:30:02
 */
public class WitherStringBuilder {
    public String implicit(String[] fields){
        String result = "";
        for (String field : fields){
            result += field;
        }
        return result;
    }

    public String explicit(String[] fields){
        StringBuilder result = new StringBuilder();
        for (String field : fields){
            result.append(field);
        }
        return result.toString();
    }
}
