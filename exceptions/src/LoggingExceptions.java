import java.util.logging.*;
import java.io.*;
/**
 * @author 刘季伟
 * @implNote 展示如何将异常输出记录到日志中
 * @since 2024/7/18 11:13:43
 */
class LoggingException extends Exception{
    private static Logger logger =
            Logger.getLogger("LoggingException");
    LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e){
            System.err.println("Caught " + e);
        }

        try {
            throw new LoggingException();
        } catch (LoggingException e){
            System.err.println("Caught " + e);
        }
    }
}
