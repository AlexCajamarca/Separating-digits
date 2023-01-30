/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moduleone;

/**
 *
 * @author alexc
 */
import java.util.Scanner;

public class ModuleOne {

    public static void main(String[] args) {
       
       Scanner myObj = new Scanner(System.in);
       
       System.out.println ("Enter a 5-digit number");
       
       int num = myObj.nextInt();
       
       int a = num / 10000;
       int b = num / 1000 % 10;
       int c = num / 100 % 10;
       int d = num / 10 % 10;
       int e = num % 10; 
       
       
       System.out.printf("%s%3s%3s%3s%3s" ,a ,b, c, d, e);
       
    }
}
