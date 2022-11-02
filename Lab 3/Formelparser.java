import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Formelparser {
    public static String isOperator(String operator) {
        // <Operator> ::= + | - | *
        if (operator == "+" || operator == "-" || operator == "*" ){
            return operator;
        }
        else{
            return "false";
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
        LinkedList<String> list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        int numberofChars = 0;
        int listSize = 0;
        words = words.replace(" ", "");

        for (char ch: words.toCharArray()) {
            numberofChars += 1;
            String str = String.valueOf(ch);
            characters.add(str);
            list.add(str);
            listSize += 1;
        }
     
        for (int i=0; i < listSize; i++){
            String currentSymbol = list.peek();
            if (isNumber(currentSymbol)){
                String siffra1 = currentSymbol;
            }
            if (isExpression(currentSymbol)){
                String expr = currentSymbol;
            }
        }
        
    }
}
// javac Words.java
// java Words < input.in