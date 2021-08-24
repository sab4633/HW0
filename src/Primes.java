//Author: Sofia Bzhilyanskaya (sab4633@rit.edu)
/**
 * HW0-1 Given an input of n through the command line the program will print each prime less than and equal to n
 */

import java.util.Scanner;

public class Primes {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //gets input

        for(int i = 2; i <= n; i++){ //iterates through till n checking if its prime
            boolean flag = true; //prime checker
            for(int j = 2; j <= (int)Math.sqrt(i); j++){
                if( flag && i%j == 0 ){
                    flag = false; //not prime
                }
            }
            if(flag){ //print value if its prime
                System.out.println(i);
            }

        }
    }
}
