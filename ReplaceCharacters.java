import java.util.Scanner;

class ReplaceString {
    String str;
}

public class ReplaceCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ReplaceString r = new ReplaceString();

        System.out.println("Enter a string:");
        r.str = sc.nextLine();

        String result = "";

        for(int i = 0; i < r.str.length(); i++){
            char ch = r.str.charAt(i);

            if(ch == 'd'){
                result += 'f';
            } else {
                result += ch;
            }
        }

        System.out.println("Modified string: " + result);
    }
}