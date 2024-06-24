/**
 * @author 刘季伟
 * @implNote
 * @since 2024/4/16 09:10:33
 */
public class ListCharacters {
    public static void main(String[] args) {
        for(char c = 0; c < 128; c++)
            if(Character.isLowerCase(c))
                System.out.println("value: " + (int)c +
                        " character: " + c);

    }
}
