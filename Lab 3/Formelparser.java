import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Formelparser {
    public static boolean isOperator(String operator) {
        // <Operator> ::= + | - | *
        if (operator == "+" || operator == "-" || operator == "*" ){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isNumber(String strNum) { //remake
        // <Siffra> ::= 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isExpression(String expr){
        // <Uttryck> ::= <Tal> | "(" <Formel> ")"
        if (expr == null){
            return false;
        }
        if (isNumber(expr) == true){
            return true;
        }
        else {
            return false;
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
        System.out.println(isExpression("23424"));     
    }
}
// javac Words.java
// java Words < input.in