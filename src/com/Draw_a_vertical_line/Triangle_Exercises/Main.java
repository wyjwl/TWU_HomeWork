package com.Draw_a_vertical_line.Triangle_Exercises;

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
        while( number<0){
            System.out.println("Invalid Input, try again:");
            number=in.nextInt();
        }
        while (number--!=0){
            System.out.print("*");
            if(number>0){
                System.out.println();
            }
        }
    }


}
