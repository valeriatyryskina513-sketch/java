public class MatrixMaxMain {
    public static void main(String[] args) throws InterruptedException {
        int[][] matrix = {
                {3, 8, 1},
                {15, 2, 9},
                {7, 21, 4},
                {6, 10, 12}
        };

        RowMaxThread[] threads = new RowMaxThread[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            threads[i] = new RowMaxThread(matrix[i]);
            threads[i].start();
        }

        int max = matrix[0][0];

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();

            if (threads[i].getMax() > max) {
                max = threads[i].getMax();
            }
        }

        System.out.println("Максимальный элемент матрицы: " + max);
    }
}
