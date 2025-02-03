package test_cases;
import src.spiral_matrix;
import java.util.List;

public class SpiralMatrixTest {
    public static void main(String[] args) {
        spiral_matrix sm = new spiral_matrix(); // Create an instance of spiral_matrix

        // Test Case 1: 3x3 Matrix
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> result1 = sm.spiralOrder(matrix1);
        System.out.println("Test Case 1: [[1,2,3],[4,5,6],[7,8,9]]");
        System.out.println(result1);
        // Expected Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]

        // Test Case 2: 3x4 Matrix
        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> result2 = sm.spiralOrder(matrix2);
        System.out.println("Test Case 2: [[1,2,3,4],[5,6,7,8],[9,10,11,12]]");
        System.out.println(result2);
        // Expected Output: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }
}
