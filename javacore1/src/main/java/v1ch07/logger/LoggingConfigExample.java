package v1ch07.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author 刘季伟
 * @implNote 通过配置文件或代码更改日志的输出格式、级别、以及输出目标（文件或控制台）——ChatGPT
 * @since 2024/10/6 10:03:38
 */
public class LoggingConfigExample {
    private static final Logger logger = Logger.getLogger(LoggingConfigExample.class.getName());

    public static void main(String[] args) {
        // 设置日志级别，只记录INFO及以上级别的日志
        logger.setLevel(Level.INFO);

        // 也可以为特定的Handler设置级别
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.SEVERE); // 只输出SEVERE级别的日志
        logger.addHandler(consoleHandler);

        logger.info("This is an info message");
        logger.severe("This is an severe message");
    }
}
