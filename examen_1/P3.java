import java.util.Random;

public class P3 {
    public static void main(String[] args) {
        int[][] a = new int[1000][1000];
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            a[i][j] = rnd.nextInt(1000); 
            }
        }
        long start = System.nanoTime();
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) { 
                int value = a[i][j]; 
            }
        }
        long endt = System.nanoTime();
        long t = endt - start;
        System.out.println("Tiempo de ejecución: " + t/ 1000 + " microsegundos");
    }
}