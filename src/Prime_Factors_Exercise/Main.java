package Prime_Factors_Exercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by WYJ on 2016/6/3.
 */
public class Main {
    public static void main(String[] args) {
        int number = getNumber();
        generate(number);
    }

    private static int getNumber() {
        int number;
        System.out.print("Please input a number:");
        Scanner in=new Scanner(System.in);
        number=in.nextInt();
        while(number<0){
            System.out.println("Invalid Input, try again:");
            number=in.nextInt();
        }
        return number;
    }

    public static void generate(int number){
        int i;
        Set<Integer> primeFactors=new HashSet<Integer>();
        while(number>=2){
            for(i=2;i<=number;i++){
                if(number%i==0){
                    if(number!=i) {
                        if (primeFactors.add(i)) {
                            break;
                        }
                    }
                    else{
                        if(isPrime(number)){
                            primeFactors.add(number);
                        }
                    }
                }
            }
            number=number/i;
        }
        System.out.println(primeFactors);
    }

    public static boolean isPrime(int num){
        int i = 2;
        while (i <= Math.sqrt(num)){
            if (num%i != 0){
                i += 2;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
