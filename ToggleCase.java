import java.util.Scanner;

class CaseChange {
    String str;
}

public class ToggleCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        CaseChange c = new CaseChange();

        System.out.println("Enter a string:");
        c.str = sc.nextLine();

        String result = "";

        for(int i = 0; i < c.str.length(); i++){
            char ch = c.str.charAt(i);

            if(Character.isLowerCase(ch)){
                result += Character.toUpperCase(ch);
            } else if(Character.isUpperCase(ch)){
                result += Character.toLowerCase(ch);
            } else {
                result += ch;
            }
        }

        System.out.println("Modified string: " + result);
    }
}