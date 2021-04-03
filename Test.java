package ShannonEntropy;
/**
 * @author: Bit Jet Kit
 * Title: Test
 * Date: April 3, 2021
 * Purpose: Test the ShannonEntropy's OOP methods.
 */
public class Test {
    public static void main(String[] args) {     
        ShannonEntropy entropy = new ShannonEntropy();
        entropy.setM();
        entropy.setN();
        entropy.setFrequencies();
        entropy.computeShannon();
        entropy.toString();
    }
}
