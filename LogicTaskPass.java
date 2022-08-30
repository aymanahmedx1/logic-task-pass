/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Ayman Ahmed
 */
public class LogicTaskPass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Write a method that will remove any given character from a String?
        String result = removeCharFromString('i', "AymaniAhmed");
        // Write a program to find all prime numbers up to a given range  of numbers
        primeNumbers(1, 20);
        //write a function that count how many the given character repeated in a given string?
        int count = countRepeatedChar("aymanAhmed");
        
    }

    private static String removeCharFromString(char c, String str) {
        String result = "";
        for (char i : str.toCharArray()) {
            if (i != c) {
                result += i;
            }
        }
        return result;
    }

    private static void primeNumbers(int lower, int upper) {

        for (int i = lower; i <= upper; i++) {

            // Skip 0 and 1 as they are
            // neither prime nor composite
            if (i == 1 || i == 0) {
                continue;
            }

            // flag variable to tell
            // if i is prime or not
            int flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1) {
                System.out.println(i);
            }
        }

    }

    private static int countRepeatedChar(String str) {
        char[] string = str.toCharArray();
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                }
            }
        }
        return count;

    }
}
