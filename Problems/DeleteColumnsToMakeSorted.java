/**
 * DeleteColumnsToMakeSorted
 */
public class DeleteColumnsToMakeSorted {

    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = strs[i].charAt(j);
            }
        }
        int index = 0;
        int count = 0;

        for (int j = 0; j < cols; j++) {
            int i = 0;
            for (i = 1; i < rows; i++) {
                index = matrix[i - 1][j];
                if (matrix[i][j] < index) {
                    count++;
                    break;
                }
            }
        }
        return count;

    }

    public static void main(String... t) {
        String[] strs = { "rrjk", "furt", "guzm" };
        DeleteColumnsToMakeSorted delete = new DeleteColumnsToMakeSorted();
        System.out.println(delete.minDeletionSize(strs));
        // delete.minDeletionSize(strs);
    }
}