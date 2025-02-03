package test_cases;
import src.pascal_triangle;
import java.util.List;

public class PascalTriangleTest {
    public static void main(String[] args) {
        pascal_triangle pt = new pascal_triangle();

        // Test Case 1: numRows = 5
        List<List<Integer>> result1 = pt.generate(5);
        System.out.println("Test Case 1: numRows = 5");
        System.out.println(result1);
        // Expected Output:
        // [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]

        // Test Case 2: numRows = 1
        List<List<Integer>> result2 = pt.generate(1);
        System.out.println("Test Case 2: numRows = 1");
        System.out.println(result2);
        // Expected Output:
        // [[1]]
    }
}
