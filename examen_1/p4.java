import java.util.Random;

public class p4 {
    public static void main(String[] args) {
        int[][][] a = new int[1000][1000][1000];
        Random rnd = new Random();
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for(int k=0;  k < a[i][j].length; k++){
                    a[i][j][k] = rnd.nextInt(1000); 
                }
            }
        }
        int value=0;
        long start = System.nanoTime();
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) { 
                for(int k=0; k < a[i][j].length; k++){
                    value = a[i][j][k]; 
                }
            }
        }
        long endt = System.nanoTime();
        long t = endt - start;
        t=t/1000;
        System.out.println("Tiempo de ejecución: " + t + " microsegundos");
    }
}
