import java.util.Scanner;

class StringStats {
    String str;
}

public class StringStatistics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StringStats s = new StringStats();

        System.out.println("Enter a string:");
        s.str = sc.nextLine();

        int upper = 0, lower = 0, digits = 0, spaces = 0;

        for(int i = 0; i < s.str.length(); i++){
            char ch = s.str.charAt(i);

            if(Character.isUpperCase(ch)) upper++;
            else if(Character.isLowerCase(ch)) lower++;
            else if(Character.isDigit(ch)) digits++;
            else if(ch == ' ') spaces++;
        }

        System.out.println("Uppercase count: " + upper);
        System.out.println("Lowercase count: " + lower);
        System.out.println("Digit count: " + digits);
        System.out.println("Space count: " + spaces);
    }
}