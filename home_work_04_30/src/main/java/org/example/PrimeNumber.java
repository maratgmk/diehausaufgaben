package org.example;

import java.util.List;
import java.util.concurrent.*;

/*
1 уровень сложности: 1. Напишите программу просчета количества всех простых в диапазоне до 1 000 000.
        Просчет выполняйте в 4 потоках, которые создаются с помощью Callable.
        Получите результаты подсчета из каждого потока и напечатайте общий результат.
 */
public class PrimeNumber {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        int num = 4;

        ExecutorService executor = Executors.newFixedThreadPool(num);
        List<Task> tasks = List.of(new Task(2,250000),new Task(250000,500000),new Task(500000,750000),new Task(750000,1000000));
       List<Future<Integer>> futures = executor.invokeAll(tasks);

       int result = 0;
        for (Future<Integer> future : futures) {
            result = result + future.get();
          //  System.out.println(result);
        }
        System.out.println("Количество простых чисел " + result);  // программа не останавливается, что продолжает делать?

    }
}
class Task implements Callable<Integer>{
    private int start;
    private int end;

    public Task(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        int count = 0;
        for (int i = start; i < end; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                count++;
        }
        return count;
    }
}