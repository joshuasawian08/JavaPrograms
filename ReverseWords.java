class ReverseString {
    String str;
}

public class ReverseWords {
    public static void main(String[] args){
        ReverseString r = new ReverseString();

        r.str = String.join(" ", args);

        String[] words = r.str.split(" ");
        String result = "";

        for(int i = words.length - 1; i >= 0; i--){
            result += words[i] + " ";
        }

        System.out.println(result.trim());
    }
}