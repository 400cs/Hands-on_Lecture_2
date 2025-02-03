package src;
import java.util.List;
import java.util.ArrayList;

public class pascal_triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();
        for (int row = 1; row <= numRows; row++) {
            List<Integer> pascalList = new ArrayList<Integer>();
            // the 1st element in a row of a pascal triangle is 1
            if (pascalList.isEmpty()) pascalList.add(1);
            // number of elements in a row should match the row index (we started counting at 1)
            while (pascalList.size() < row) {
                // the last element in a row of a pascal triangle is 1
                if (pascalList.size() + 1 == row) {
                    pascalList.add(1);
                }
                else {
                    int currentPos = pascalList.size();
                    // add the previous row's elements (prev row is row - 2 b/c row starts at 1)
                    int sum = pascalTriangle.get(row - 2).get(currentPos)
                            + pascalTriangle.get(row - 2).get(currentPos - 1);
                    pascalList.add(sum);
                }
            }
            pascalTriangle.add(pascalList);
        }
        return pascalTriangle;
    }
}
