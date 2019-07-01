/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontask;
import java.util.Scanner;

public class solution {
	
    public static final ExceptionTask calculator = new ExceptionTask();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
    	
    	System.out.println();
    	
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
