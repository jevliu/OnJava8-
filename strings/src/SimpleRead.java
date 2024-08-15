import java.io.*;
import java.util.Arrays;

/**
 * @author 刘季伟
 * @implNote 一般的解析数据的方法
 * @since 2024/8/14 20:36:35
 */
public class SimpleRead {
    public static BufferedReader input = new BufferedReader(new StringReader(
            "Sir Robin of Camelot\n22 1.61803"
    ));
    public static void main(String[] args){
        try {
            System.out.println("What's your name?");
            String name = input.readLine(); // 按行读入，每次读取一行
            System.out.println(name);
            System.out.println("How old are you? " + "What is your favorite double?");
            System.out.println("(input: <age> <double>)");
            String numbers = input.readLine(); // 接着读取下一行
            System.out.println(numbers);
            String[] numArray = numbers.split(" ");
//            System.out.println(Arrays.toString(numArray));
            int age = Integer.parseInt(numArray[0]);
            double favorite = Double.parseDouble(numArray[1]);
            System.out.format("Hi %s.%n", name);
            System.out.format("In 5 years you will be %d.%n", age + 5);
            System.out.format("My favorite double is %f.", favorite / 2);
        } catch (IOException e) {
            System.err.println("I/O exception");
        }
    }

}
