import java.util.Arrays;
import java.util.Random;

public class  P5 {
    public static int BusqBin(int[] arr, int num) {
        int izq = 0, der = arr.length - 1;
        while (izq <= der) {
            int mitad = izq + (der - izq) / 2; 
            if (arr[mitad] == num) {
                return mitad; 
            } 
            else if (arr[mitad] > num) {
                der = mitad - 1; 
            } 
            else { 
                izq = mitad + 1; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random rnd = new Random();
        for (int i = 0; i < 1000; i++) {
            arr[i] = rnd.nextInt(1000); 
        }
        Arrays.sort(arr); 
        int num = arr[rnd.nextInt(1000)]; 
        long start = System.nanoTime();
        int res = BusqBin(arr, num);
        long endt = System.nanoTime();
        long t = endt - start; 
        System.out.println("Tiempo de ejecución: " + t/1000 + " microsegundos");
    }
}
