/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan12;

/**
 *
 * @author U53R
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParallelThreadsCreator {
    // creating 10 threads and waiting for them to complete then again repeat steps.
    public static void multiply(int[][] matrix1, int[][] matrix2, int[][] result) {
        List threads = new ArrayList<>();
        int rows1 = matrix1.length;
        for (int i = 0; i < rows1; i++) {
        RowMultiplyWorker task = new RowMultiplyWorker(result, matrix1, matrix2, i);
            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);
            if (threads.size() % 10 == 0) {
                waitForThreads(threads);
            }
        }
    }

    private static void waitForThreads(List threads) {
        for (Iterator it = threads.iterator(); it.hasNext();) {
            Thread thread = (Thread) it.next();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        threads.clear();
    }
}
