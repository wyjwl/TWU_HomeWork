package Diamond_Exercises.Diamond;

import com.sun.rowset.internal.Row;

import java.util.Scanner;

/**
 * Created by WYJ on 2016/6/3.
 */
public class Main {
    public static void main(String[] args) {
        int number = getNumber();
        int maxLayerNumber = getMaxLayerNumber(number);
        printAboveTriangle(number, maxLayerNumber);
        printBottomTriangle(number, maxLayerNumber);
    }

    private static void printBottomTriangle(int number, int maxLayerNumber) {
        for(int rowNumber=number-1;rowNumber>0;rowNumber--){
            for(int colNumber=1;colNumber<=maxLayerNumber;colNumber++){
                if(colNumber>number-rowNumber && colNumber<number+rowNumber){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            if(rowNumber!=1){
                System.out.println();
            }
        }
    }

    private static void printAboveTriangle(int number, int maxLayerNumber) {
        for(int rowNumber=1;rowNumber<=number;rowNumber++){
            for(int colNumber=1;colNumber<=maxLayerNumber;colNumber++){
                if(colNumber>number-rowNumber && colNumber<number+rowNumber){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static int getMaxLayerNumber(int number) {
        return 2*number-1;
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
