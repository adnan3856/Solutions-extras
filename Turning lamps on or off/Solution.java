//As no language was mentioned so solution is given in java.

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] lamp = new int[50];   //50 lighting lamps,'0' denotes off, '1' is on
        Arrays.fill(lamp, 0);      //initially all lamps are off
        int cars = 10;  //10 cars
        for (int i = 1; i <= cars; i++) {
            for (int j = 0; j < lamp.length; j++) {
                if (((j + 1) % i) == 0) {   //if lamp is divisible by car then
                    if (lamp[j] == 0) {     //if lamp is off, turn on
                        lamp[j] = 1;
                    } else {        //else turn off
                        lamp[j] = 0;
                    }
                }
                }
            }
        System.out.println("After 10 cars finish race track driving :\n");
            System.out.println("Lamps that are ON:");
            for (int k = 0; k < lamp.length; k++) {
                if (lamp[k] == 1) {
                    System.out.print(k + 1 + " ");
                }
            }
            System.out.println("\n");
            System.out.println("Lamps that are OFF:");
            for (int k = 0; k < lamp.length; k++) {
                if (lamp[k] == 0) {
                    System.out.print(k + 1 + " ");
                }
            }
        System.out.println("------------------------------------");
        }
    }
