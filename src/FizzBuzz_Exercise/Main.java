package FizzBuzz_Exercise;

import java.util.Scanner;

/**
 * Created by WYJ on 2016/6/3.
 */
public class Main {
    public static void main(String[] args) {
        FizzBuzz();
    }

    public static void FizzBuzz(){
        int Fizz = getFizz();
        int Buzz = getBuzz();
        String[] word = setWords();
        sayWords(Fizz, Buzz, word);
    }

    private static void sayWords(int fizz, int buzz, String[] word) {
        for(int i=1;i<=100;i++){
            int say = (i%(fizz * buzz)==0?0:(i% fizz ==0?1:(i% buzz ==0?2:-1)));
            if(say!=-1){
                System.out.println(word[say]);
            }
            else{
                System.out.println(i);
            }
        }
    }

    private static String[] setWords() {
        return new String[]{"FizzBuzz","Fizz","Buzz"};
    }

    private static int getBuzz() {
        int Buzz;
        System.out.print("Please input Buzz number:");
        Scanner in=new Scanner(System.in);
        Buzz=in.nextInt();
        while(Buzz<0){
            System.out.println("Invalid Input, try again:");
            Buzz=in.nextInt();
        }
        return Buzz;
    }

    private static int getFizz() {
        int Fizz;
        System.out.print("Please input Fizz number:");
        Scanner in=new Scanner(System.in);
        Fizz=in.nextInt();
        while(Fizz<0){
            System.out.println("Invalid Input, try again:");
            Fizz=in.nextInt();
        }
        return Fizz;
    }
}
