import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Formelparser {
    public static String checkOperator(String operator) {
      
        if (operator == "+" || operator == "-" || operator == "*" ){
            return operator;
        }
        else{
            return "";
        }

    }

    public static void main(String[] args) {

        List<String> characters = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        int numberofChars = 0;
        words = words.replace(" ", "");

        for (char ch: words.toCharArray()) {
            numberofChars += 1;
            String str = String.valueOf(ch);
            characters.add(str);

        }

        System.out.println(checkOperator("2"));
        System.out.println(checkOperator("*"));

    }
}
// javac Words.java
// java Words < input.in