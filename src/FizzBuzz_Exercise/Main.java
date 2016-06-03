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
        int Fizz,Buzz;
        System.out.print("Please input Fizz number:");
        Scanner in=new Scanner(System.in);
        Fizz=in.nextInt();
        while(Fizz<0){
            System.out.println("Invalid Input, try again:");
            Fizz=in.nextInt();
        }
        System.out.print("Please input Buzz number:");
        Buzz=in.nextInt();
        while(Buzz<0){
            System.out.println("Invalid Input, try again:");
            Buzz=in.nextInt();
        }
        String[] word={"FizzBuzz","Fizz","Buzz"};
        for(int i=1;i<=100;i++){
            int say = (i%(Fizz*Buzz)==0?0:(i%Fizz==0?1:(i%Buzz==0?2:-1)));
            if(say!=-1){
                System.out.println(word[say]);
            }
            else{
                System.out.println(i);
            }
        }
    }
}
