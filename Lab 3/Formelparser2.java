import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formelparser2 {


    public static void main(String[] args) {

        //TAR IN ( ... )

        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        Matcher m = Pattern.compile("\\((.*?)\\)").matcher(words);
        String content = "";
        int firstNumber = 0;
        int secondNumber = 0;
        int result = 0;
    
        if (m.find()) {
            content = m.group(1).replace(" ", "");
            char first = content.charAt(0);
            char operandCH = content.charAt(1);
            String operand = Character.toString(operandCH);
            char second = content.charAt(2);
            firstNumber = first - '0';
            secondNumber = second - '0';
            
            if (operand.matches("[-]")){
                result = firstNumber - secondNumber;
            }

            if (operand.matches("[+]")){
                result = firstNumber + secondNumber;
            }

            if (operand.matches("['*']")){
                result = firstNumber * secondNumber;
            }
            System.out.println(words);
            System.out.println(result);
        }
                    
    }
}
// javac Words.java
// java Words < input.in