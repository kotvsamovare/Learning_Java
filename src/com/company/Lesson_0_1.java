/*1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.*/
package com.company;
import java.util.Scanner;
public class Lesson_0_1 {
    public static void main(String[] args) {
       Scanner scr = new Scanner(System.in) ;
       int a = scr.nextInt();
       int b = scr.nextInt();
       int c = scr.nextInt();
       int z = ((a - 3) * b / 2) + c ;
       System.out.println(z);
    }
}
