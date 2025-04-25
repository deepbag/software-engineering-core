package data_structure_algorithm.data_structure;
import java.util.Arrays;

public class ArrayFixed {
    public static void main(String[] arg){
        // Declaring and Initializing a Fixed Array
        int[] numbers = new int[5]; // Array of size 5
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Printing via loop
        for(int a: numbers){
            System.out.println("Numbers: "+a);
        }

        // Declaring and Initializing with Values
        String[] fruits = {"Apple", "Banana", "Orange"};
        // Accessing Elements
        System.out.println(fruits[1]); // Banana

        // Printing via loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // Array Length
        System.out.println("Size: " + fruits.length); // Size: 3

        // Sorting an Array
        int[] scores = {50, 20, 90, 40};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        // Copying an Array
        int[] copy = Arrays.copyOf(scores, scores.length);
        System.out.println(Arrays.toString(copy));

        // Multidimensional Array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(matrix[1][2]); // 6
    }
}
