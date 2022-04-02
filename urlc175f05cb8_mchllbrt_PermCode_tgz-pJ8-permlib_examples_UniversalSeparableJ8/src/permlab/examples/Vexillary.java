/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package permlab.examples;

import permlib.classes.MultiPermutationClass;
import permlib.Permutation;
import permlib.Permutations;
import permlib.property.PermProperty;

/**
 *
 * @author MichaelAlbert
 */
public class Vexillary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] stringBasis = new String[]{"2 1 4 3 6 5", "3 2 1 6 5 4", "2 4 1 3 7 6 5", "2 4 1 6 3 7 5", "2 4 1 7 3 6 5", "3 1 4 2 7 6 5", "3 1 5 2 7 4 6", "3 1 5 2 7 6 4", "3 2 1 5 7 4 6", "3 2 1 6 4 7 5", "3 2 5 1 7 4 6", "4 2 1 6 3 7 5", "2 4 1 3 6 8 5 7", "2 4 1 3 7 5 8 6", "3 1 4 2 6 8 5 7", "3 1 4 2 7 5 8 6", "3 4 1 2 8 7 6 5", "3 4 1 7 2 8 6 5", "3 4 1 8 2 7 6 5", "3 5 1 2 8 7 4 6", "3 5 1 2 8 7 6 4", "3 5 1 7 2 8 4 6", "3 5 1 7 2 8 6 4", "3 5 1 8 2 7 4 6", "3 5 1 8 2 7 6 4", "3 5 2 1 7 8 4 6", "3 5 2 7 1 8 4 6", "3 5 2 8 1 7 4 6", "4 3 1 7 2 8 5 6", "4 3 2 1 7 8 5 6", "4 3 2 7 1 8 5 6", "5 3 1 7 2 8 4 6", "5 3 1 7 2 8 6 4", "5 3 2 1 7 8 4 6", "5 3 2 7 1 8 4 6", "2 4 6 1 3 8 9 5 7", "2 5 4 1 3 8 9 6 7", "2 6 4 1 3 8 9 5 7", "3 4 1 2 6 9 8 5 7", "3 4 1 2 7 9 5 8 6", "3 4 1 2 7 9 6 5 8", "3 4 1 2 7 9 6 8 5", "3 4 1 2 8 5 9 7 6", "3 4 1 2 8 6 9 5 7", "3 4 1 2 8 6 9 7 5", "3 4 1 2 8 7 5 9 6", "3 4 1 2 9 6 8 5 7", "3 4 1 2 9 7 5 8 6", "3 4 1 7 2 8 5 9 6", "3 4 1 8 2 6 9 5 7", "3 4 1 8 2 7 5 9 6", "3 4 1 9 2 6 8 5 7", "3 4 1 9 2 7 5 8 6", "3 5 1 2 7 9 4 6 8", "3 5 1 2 7 9 6 4 8", "3 5 1 2 7 9 6 8 4", "3 5 1 2 8 6 9 4 7", "3 5 1 2 8 6 9 7 4", "3 5 1 4 2 8 9 6 7", "3 5 1 4 8 2 9 6 7", "3 5 2 1 4 8 9 6 7", "3 5 2 4 1 8 9 6 7", "3 5 2 4 8 1 9 6 7", "3 6 1 4 2 8 9 5 7", "4 1 5 2 8 3 9 6 7", "4 1 5 3 2 8 9 6 7", "4 1 5 3 8 2 9 6 7", "4 2 5 1 3 8 9 6 7", "4 2 5 3 1 8 9 6 7", "4 2 5 3 8 1 9 6 7", "4 3 1 5 2 8 9 6 7", "5 2 4 1 3 8 9 6 7", "5 3 1 4 2 8 9 6 7", "6 2 4 1 3 8 9 5 7", "6 3 1 4 2 8 9 5 7", "2 4 6 1 3 5 9 10 7 8", "3 4 1 2 6 8 10 5 7 9", "3 4 1 2 8 5 9 6 10 7", "3 4 7 1 2 9 10 5 8 6", "3 4 7 1 2 9 10 6 5 8", "3 4 7 1 2 9 10 6 8 5", "3 5 7 1 2 9 10 4 6 8", "3 5 7 1 2 9 10 6 4 8", "3 5 7 1 2 9 10 6 8 4", "3 6 4 1 2 9 10 7 5 8", "3 6 4 1 2 9 10 7 8 5", "3 6 5 1 2 9 10 4 7 8", "3 6 5 1 2 9 10 7 4 8", "3 6 5 1 2 9 10 7 8 4", "3 7 4 1 2 9 10 5 8 6", "3 7 4 1 2 9 10 6 5 8", "3 7 4 1 2 9 10 6 8 5", "3 7 5 1 2 9 10 4 6 8", "3 7 5 1 2 9 10 6 4 8", "3 7 5 1 2 9 10 6 8 4", "4 1 5 2 6 3 9 10 7 8", "4 5 1 2 8 10 3 9 6 7", "4 5 1 2 9 8 3 10 6 7", "4 5 1 2 10 8 3 9 6 7", "4 5 1 3 8 10 2 9 6 7", "4 5 1 3 9 2 8 10 6 7", "4 5 1 3 9 8 2 10 6 7", "4 5 1 3 10 2 8 9 6 7", "4 5 1 3 10 8 2 9 6 7", "4 5 1 8 2 9 3 10 6 7", "4 5 1 8 3 2 9 10 6 7", "4 5 1 8 3 9 2 10 6 7", "4 5 1 9 2 8 3 10 6 7", "4 5 1 9 3 2 8 10 6 7", "4 5 1 9 3 8 2 10 6 7", "4 5 1 10 2 8 3 9 6 7", "4 5 1 10 3 2 8 9 6 7", "4 5 1 10 3 8 2 9 6 7", "4 5 2 3 8 10 1 9 6 7", "4 5 2 3 9 1 8 10 6 7", "4 5 2 3 9 8 1 10 6 7", "4 5 2 3 10 1 8 9 6 7", "4 5 2 3 10 8 1 9 6 7", "4 5 2 8 1 3 9 10 6 7", "4 5 2 8 3 1 9 10 6 7", "4 5 2 8 3 9 1 10 6 7", "4 5 2 9 1 3 8 10 6 7", "4 5 2 9 3 1 8 10 6 7", "4 5 2 9 3 8 1 10 6 7", "4 5 2 10 1 3 8 9 6 7", "4 5 2 10 3 1 8 9 6 7", "4 5 2 10 3 8 1 9 6 7", "5 3 6 1 2 9 10 4 7 8", "5 3 6 1 2 9 10 7 4 8", "5 3 6 1 2 9 10 7 8 4", "6 3 4 1 2 9 10 7 5 8", "6 3 4 1 2 9 10 7 8 5", "6 3 5 1 2 9 10 4 7 8", "6 3 5 1 2 9 10 7 4 8", "6 3 5 1 2 9 10 7 8 4", "7 3 4 1 2 9 10 5 8 6", "7 3 4 1 2 9 10 6 5 8", "7 3 4 1 2 9 10 6 8 5", "7 3 5 1 2 9 10 4 6 8", "7 3 5 1 2 9 10 6 4 8", "7 3 5 1 2 9 10 6 8 4", "3 4 7 1 2 5 10 11 8 6 9", "3 4 7 1 2 5 10 11 8 9 6", "3 4 7 1 2 6 10 11 5 8 9", "3 4 7 1 2 6 10 11 8 5 9", "3 4 7 1 2 6 10 11 8 9 5", "3 4 8 1 2 6 10 11 5 7 9", "3 5 7 1 2 6 10 11 4 8 9", "3 5 7 1 2 6 10 11 8 4 9", "3 5 7 1 2 6 10 11 8 9 4", "3 6 4 1 2 7 10 11 5 8 9", "3 7 4 1 2 6 10 11 5 8 9", "3 8 4 1 2 6 10 11 5 7 9", "4 5 1 2 6 10 3 9 11 7 8", "4 5 1 2 6 11 3 9 10 7 8", "4 5 1 2 9 6 3 10 11 7 8", "4 5 1 2 9 6 10 3 11 7 8", "4 5 1 2 10 6 3 9 11 7 8", "4 5 1 2 11 6 3 9 10 7 8", "4 5 1 3 9 2 6 10 11 7 8", "4 5 1 3 9 6 2 10 11 7 8", "4 5 1 3 9 6 10 2 11 7 8", "4 5 1 9 2 6 3 10 11 7 8", "4 5 1 10 2 6 3 9 11 7 8", "4 5 1 11 2 6 3 9 10 7 8", "4 5 2 3 9 1 6 10 11 7 8", "4 5 2 3 9 6 1 10 11 7 8", "4 5 2 3 9 6 10 1 11 7 8", "4 5 8 1 2 10 11 3 9 6 7", "4 5 8 1 3 10 11 2 9 6 7", "4 5 8 2 3 10 11 1 9 6 7", "4 8 5 1 2 10 11 3 9 6 7", "4 8 5 1 3 10 11 2 9 6 7", "4 8 5 2 3 10 11 1 9 6 7", "5 6 3 9 1 2 10 11 4 7 8", "5 6 3 9 1 2 10 11 7 4 8", "5 6 3 9 1 2 10 11 7 8 4", "5 6 3 10 1 2 9 11 4 7 8", "5 6 3 10 1 2 9 11 7 4 8", "5 6 3 10 1 2 9 11 7 8 4", "5 6 3 11 1 2 9 10 4 7 8", "5 6 3 11 1 2 9 10 7 4 8", "5 6 3 11 1 2 9 10 7 8 4", "6 3 4 1 2 7 10 11 5 8 9", "7 3 4 1 2 6 10 11 5 8 9", "8 3 4 1 2 6 10 11 5 7 9", "8 4 5 1 2 10 11 3 9 6 7", "8 4 5 1 3 10 11 2 9 6 7", "8 4 5 2 3 10 11 1 9 6 7"};
        MultiPermutationClass m = new MultiPermutationClass(stringBasis);
        for (int n = 3; n <= 12; n++) {
            int count = 0;
            int simpleCount = 0;
            for (Permutation p : new Permutations(m, n)) {
                count++;
                if (PermProperty.SIMPLE.isSatisfiedBy(p)) {
                    simpleCount++;
                }
            }
            System.out.println(n + " " + count + " " + simpleCount);
        }
    }
}
