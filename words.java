import java.util.Scanner;
public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String totalstring = "";
        int numberOfWords = sc.nextInt();
     
        for (int i=0; i <= numberOfWords; i++){
            String words = sc.nextLine();
            totalstring += words;
        }
        totalstring = totalstring.replace(" ", "");
        System.out.println(totalstring);    
        
    }
}
// javac Words.java
// java Words < input.in