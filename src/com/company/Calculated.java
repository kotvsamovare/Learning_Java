package com.company;
import java.util.Scanner;
public class Calculated { // тут необходимо я думаю сделать отдельный класс ( арифметической операции )
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String d = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ((a <= 10) & (b <=10)) {
                switch (d) {
                    case "+":
                        System.out.println("Ответ:" + (a + b));
                        break;
                    case "-":
                        System.out.println("Ответ:" + (a - b));
                        break;
                    case "*":
                        System.out.println("Ответ:" + (a * b));
                        break;
                    case "/":
                        System.out.println("Ответ:" + (a / b));
                        break;
                }
            }else
            System.out.println("Вы ввели число A или B превышающие условие");
        }
    }
