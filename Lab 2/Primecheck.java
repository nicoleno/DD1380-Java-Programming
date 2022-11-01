import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Primecheck {

    public static List<Long> primeFactors(long numbers) {
        long n = numbers;
        List<Long> factors = new ArrayList<Long>();
        for (long i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long numberOfIntegers = sc.nextInt();
        long sum = 0;
        
        for (int i=0; i < numberOfIntegers; i++){
            long newNumber = sc.nextLong();
            sum += newNumber;
            
        }
        List<Long> allFactors = (primeFactors(sum));
        System.out.println(allFactors.get(0));

    

    }
}
// javac Words.java
// java Words < input.in