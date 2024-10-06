package v1ch07.logger;

import java.util.logging.Logger;
import java.util.logging.Level;
/**
 * @author 刘季伟
 * @implNote 展示日志的基本用法
 * @since 2024/10/6 09:50:00
 */
public class LoggerTest {
    // Create an object of LoggerTest, the parameter is the class name
    private static final Logger logger = Logger.getLogger(Logger.class.getName());

    public static void main(String[] args) {
        // Logging: loggers of different level
        logger.info("This is an info message"); // info level
        logger.warning("This is a warning message"); // warning level
        logger.severe("This is a severe error message"); // severe level

        try {
            int result = 10 / 0; // cause an abnormal
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Exception occurred: {0}", e.getMessage()); // capture and record
        }
    }
}
