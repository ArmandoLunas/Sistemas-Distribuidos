import java.util.Random;

public class p2 {
    public static void main(String[] args) {
        int[] a = new int[1000];
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(10000); 
        }
        int value;
        long start = System.nanoTime();
        for (int j = 0; j < a.length; j++) {
            value = a[j]; 
        }
        long endt = System.nanoTime();
        long t = endt - start;
        t/=1000;
        System.out.println("Tiempo de ejecución: " + t + " microsegundos");
    }
}
