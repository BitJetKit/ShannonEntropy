package ShannonEntropy;

import java.util.Scanner;

/**
 * @author: Bit Jet Kit
 * Title: ShannonEntropy
 * Date: April 3, 2021
 * Purpose: From the user, read 2 integers, m and n. 
 *          Then, between 1 and m, 
 *          read a sequence of n integers: from user input.
 *          Of the user output's sequence, print the Shannon entropy. 
 * Original Source: Princeton University
 */
public class ShannonEntropy {
    // Declare the Scanner.
    Scanner readUserInput = new Scanner(System.in);
    // Between 1 and m, this is an n-integer sequence. 
    private int m;
    // This is the total integers.
    private int n;
    // The array frequencies[i] is the number of times integer, i, appears.
    int[] frequencies = new int[m + 1];
    // This is the entropy.
    double entropy = 0.0;
    // These are the accessors.
    public void setM(){
        System.out.println("From standard input, enter an integer m: ");
        m = readUserInput.nextInt();
    }
    public void setN(){
        System.out.println("From standard input, enter an integer, n: ");
        n = readUserInput.nextInt();
    }
    // Compute the frequencies.
    public void setFrequencies(){
        for(int j = 0; j < n; j++){
            System.out.println("From standard input, enter an integer value: ");
            int value = readUserInput.nextInt();
            frequencies[value]++;
        }
    }
    // Compute the Shannon entropy.
    public void computeShannon(){
        for(int i = 1; i <= m; i++){
            double p = 1.0 * frequencies[i] / n;
            if(frequencies[i] > 0){
                entropy -= p * Math.log(p) / Math.log(2);
            }
        }
    }
    // Print the results.
    public String toString(){
        return ("Shannon Entropy: " + String.valueOf(entropy));
    }
}
