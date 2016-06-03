package Triangle_Exercises.Draw_a_right_triangle;

import java.util.Scanner;

/**
 * Created by WYJ on 2016/6/3.
 */
public class Main {
    public static void main(String[] args) {
        int number;
        System.out.print("Please input number:");
        Scanner in=new Scanner(System.in);
        number=in.nextInt();
        while(number<0){
            System.out.println("Invalid Input, try again:");
            number=in.nextInt();
        }
        for(int rowNumber=1;rowNumber<=number;rowNumber++){
            for(int colNumber=1;colNumber<=rowNumber;colNumber++){
                System.out.print("*");
            }
            if(rowNumber!=number) {
                System.out.println();
            }
        }
    }
}
