
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaApplication5 {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Large Number");
        int value = scan.nextInt();
        int temp = value;

        System.out.print("Enter Target Index ");
        int n = scan.nextInt();
        int len = 0;

//        to find the length of an array 
        while (temp > 0) {
            temp /= 10;
            len++;
        }
        
        if(n >= len){
            System.out.println("Index number is out of bound !");
            
        }
        else{
            int targetInd = len - n;

            while (targetInd-- > 0) {
           	 value /= 10;
            }

            System.out.println(value % 10);
        }


        

    }

}
