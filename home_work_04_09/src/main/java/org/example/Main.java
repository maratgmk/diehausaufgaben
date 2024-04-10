package org.example;
/*
3**. В классе писали задачу для поиска всех простых числа в диапазоне до 1 000 000.
Напишите программу, запустив которую вы сможете определить оптимальное количество
создаваемых потоков для выполнения этой задачи на текущем компьютере.
Используйте общее время выполнения программы при обработке всего диапазона чисел
для расчета оптимального количества созданных потоков.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("-- Start --");
        long startTime = System.currentTimeMillis();
        ThreadTask task1 = new ThreadTask(2,435000);
        ThreadTask task2 = new ThreadTask(435001,625000);
        ThreadTask task3 = new ThreadTask(625001,780000);
        ThreadTask task4 = new ThreadTask(780001,900000);
        ThreadTask task5 = new ThreadTask(900001,1000000);
        task1.start();
        task2.start();
        task3.start();
        task4.start();
        task5.start();

        task1.join();
        task2.join();
        task3.join();
        task4.join();
        task5.join();

        System.out.println(Thread.currentThread().getName() + "  -> Main Time = " + (System.currentTimeMillis() - startTime));
        System.out.println("--End--");


    }
}
class ThreadTask extends Thread {
    private int start;
    private int end;

    public ThreadTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        int count = 0;
        long startTime = System.currentTimeMillis();
        for (int i = start; i < end; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                //               System.out.println(i);
            }
        }
        System.out.println(Thread.currentThread().getName() + " -> Count = " + count + " ---- " + start + " .... " + end);
        System.out.println(Thread.currentThread().getName() + "  -> Time = " + (System.currentTimeMillis() - startTime));
    }
}