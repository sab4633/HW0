//Author: Sofia Bzhilyanskaya (sab4633@rit.edu)
/**
 * HW0-2 Given an input of n, with n integers that follow this program will print the smallest number out of the set
 * followed by the second smallest.
 */

import java.util.Scanner;

public class SmallestTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //gets input
        int smallest = 100000;
        int secondSmallest = 100000;
        for(int i = 0; i< n; i++){ //collects each input keeping track of two distinct small values
            int newInt = sc.nextInt();
            if(newInt < smallest){ //if its smaller it shift them
                secondSmallest = smallest;
                smallest = newInt;
            }else if(newInt < secondSmallest && newInt != smallest){ //cant be equal to the smallest
                secondSmallest = newInt;
            }
        }
        System.out.println(smallest + "\n" + secondSmallest); //output
    }
}
