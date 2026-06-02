public class ArraySumMain {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int middle = array.length / 2;

        ArraySumThread thread1 = new ArraySumThread(array, 0, middle);
        ArraySumThread thread2 = new ArraySumThread(array, middle, array.length);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        int totalSum = thread1.getSum() + thread2.getSum();

        System.out.println("Сумма элементов массива: " + totalSum);
    }
}
