public class RowMaxThread extends Thread {
    private int[] row;
    private int max;

    public RowMaxThread(int[] row) {
        this.row = row;
        this.max = row[0];
    }

    public void run() {
        for (int i = 1; i < row.length; i++) {
            if (row[i] > max) {
                max = row[i];
            }
        }
    }

    public int getMax() {
        return max;
    }
}
