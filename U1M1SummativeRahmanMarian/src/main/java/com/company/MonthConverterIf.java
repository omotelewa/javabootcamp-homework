
package com.company;

import java.util.Scanner;

public class MonthConverterIf {
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 12.");
        int month= sc.nextInt();
        if(month>12 || month<1){
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
        else{
            if(month==1){
                System.out.println("January");
            }
            else if(month== 2){
                System.out.println("February");
            }
            else  if(month==3){
                System.out.println("March");

            }
            else  if(month==4){
                System.out.println("April");

            }
            else  if(month==5){
                System.out.println("May");

            }
            else  if(month==6){
                System.out.println("June");

            }
            else  if(month==7){
                System.out.println("July");

            }
            else  if(month==8){
                System.out.println("August");

            }
            else  if(month==9){
                System.out.println("September");

            }
            else  if(month==10){
                System.out.println("October");

            }
            else  if(month==11){
                System.out.println("November");

            }
            else{
                System.out.println("December");
            }
        }
    }
}
