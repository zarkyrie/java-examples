package leetcode;

public class Sol598 {
    public int maxCount(int m, int n, int[][] ops) {
        int minRow = m;
        int minCol = n;
        for (int[] cur : ops) {
            if (cur[0] < minRow) {
                minRow = cur[0];
            }

            if (cur[1] < minCol) {
                minCol = cur[1];
            }
        }

        return minRow * minCol;
    }

    public static void main(String[] args) {
        Sol598 sol = new Sol598();
        int[][] operations = {{2, 2}, {3, 3}};
        int res = sol.maxCount(2, 2, operations);
        System.out.println(res);
    }
}
