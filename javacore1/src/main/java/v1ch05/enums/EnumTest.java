package v1ch05.enums;


import java.util.Scanner;

/**
 * @author 刘季伟
 * @implNote
 * @since 2024/9/29 19:56:00
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size :(SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" +size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _.");

        String nameOfSize = Size.LARGE.toString();
        System.out.println(nameOfSize);

        System.out.println(Size.SMALL.compareTo(Size.LARGE));
    }

}

enum Size {

    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private String abbreviation;
    private Size(String abbreviation){this.abbreviation = abbreviation;}

    public String getAbbreviation() {return abbreviation;}
}