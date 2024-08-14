/**
 * @author 刘季伟
 * @implNote 展示String.format()的用法。
 * @since 2024/8/12 10:41:06
 */
public class DatabaseException extends Exception{
    public DatabaseException(int transactionID, int queryID, String message){
        super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
    }

    public static void main(String[] args) {
        try{
            throw new DatabaseException(3, 7, "Write failed");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}