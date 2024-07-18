import java.util.logging.*;
import java.io.*;
/**
 * @author 刘季伟
 * @implNote 通过在异常处理程序中生成日志消息，来捕获和记录他人编写的异常
 * @since 2024/7/18 11:26:14
 */
public class LoggingExceptions2 {
    private static Logger logger =
            Logger.getLogger("LoggingExceptions2");

    static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e){
            logException(e);
        }
    }
}
