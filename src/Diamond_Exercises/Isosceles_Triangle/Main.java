package Diamond_Exercises.Isosceles_Triangle;

import java.util.Scanner;

/**
 * Created by WYJ on 2016/6/3.
 */
public class Main {
    public static void main(String[] args) {
        int number = getNumber();
        print(number);
    }

    private static void print(int number) {
        int maxLayerNumber=2*number-1;
        for(int rowNumber=1;rowNumber<=number;rowNumber++){
            for(int colNumber=1;colNumber<=maxLayerNumber;colNumber++){
                if(colNumber>number-rowNumber && colNumber<number+rowNumber){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            if(rowNumber!=number) {
                System.out.println();
            }
        }
    }

    private static int getNumber() {
        int number;
        System.out.print("Please input number:");
        Scanner in=new Scanner(System.in);
        number=in.nextInt();
        while(number<0){
            System.out.println("Invalid Input, try again:");
            number=in.nextInt();
        }
        return number;
    }
}
