/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21calculator;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV21Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Calculator Incorporated Limited Global EE © 2100%n");
        System.out.printf("A = ");
        double a = scanner.nextDouble();
        System.out.printf("B = ");
        double b = scanner.nextDouble();
        System.out.printf("[+,-,*,/] ");
        String operator = scanner.next();
        
        switch(operator) {
            case "+":
                System.out.printf(Locale.FRENCH, "A + B = %f%n", a+b);
                break;
            case "-":
                System.out.printf(Locale.FRENCH, "A - B = %f%n", a-b);
                break;
            case "*":
                System.out.printf(Locale.FRENCH, "A * B = %f%n", a*b);
                break;
            case "/":
                System.out.printf(Locale.FRENCH, "A / B = %f%n", a/b);
                break;
            default:
                System.out.printf("Error operator!%n");
                break;
        }
    }
}
