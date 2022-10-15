import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner pepa = new Scanner(System.in);

        System.out.println("Enter string:");
        String mainStr = pepa.nextLine();

        int upperCase = 0, lowerCase = 0, number = 0, whitespace = 0;
        char ch;
        String newstr = "";

        for(int i = 0; i < mainStr.length(); i++)
        {
            ch = mainStr.charAt(i);
            newstr = ch + newstr;

            char c = mainStr.charAt(i);
            if (c >= 'A' && c <= 'Z')
                upperCase++;
            else if (c >= 'a' && c <= 'z')
                lowerCase++;
            else if (c >= '0' && c <= '9')
                number++;
            else if (c == ' ')
                whitespace++;
        }

        System.out.println(mainStr.length() + "  String length.");
        System.out.println(upperCase + "  Upper case characters.");
        System.out.println(lowerCase + "  Lower case characters.");
        System.out.println(number + "  Count of numbers.");
        System.out.println(whitespace + "  Count of whitespaces");
        System.out.println(newstr + "  Reversed string.");
        System.out.println(mainStr.toLowerCase() + "  Lowercased string.");
        System.out.println(mainStr.toUpperCase() + "  Uppercased string.");
        System.out.println(mainStr.substring(0, mainStr.length() / 2) + "  Half/Lower half of the string.");
    }
}