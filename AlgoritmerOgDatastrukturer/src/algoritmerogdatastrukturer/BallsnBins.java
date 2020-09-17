package algoritmerogdatastrukturer;

import java.util.Arrays;
import java.util.Random;

public class BallsnBins {

    public static void main(String[] args) {
        //int number = 10007;
        //int[] bins = new int[10007];
       
        int number = 32749;
        int[] bins = new int[32749];
        
        
        // System.out.println(Arrays.toString(binBalls(number, bins)));
        
        System.out.println(Arrays.toString(binBallsPowerof(number, bins)));
        
        System.out.println(maxValue(bins));
        System.out.println(count(bins));

    }

    public static int maxValue(int array[]) {
        int max = Arrays.stream(array).max().getAsInt();
        return max;
    }

    public static int[] binBalls(int balls, int[] bins) {
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < balls; i++) {

            int random = rand.nextInt(balls);
            bins[random] += 1;
        }
        return bins;
    }

    public static int count(int[] bins) {
        int result = 0;
        for (int i : bins) {
            result += i;
        }
        return result;

    }

    // opgave 3 power of 2
    public static int[] binBallsPowerof(int balls, int[] bins) {
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < balls; i++) {

            int random1 = rand.nextInt(balls);
            int random2 = rand.nextInt(balls);
            if (bins[random1] > bins[random2]) {
                bins[random2] += 1;

            } else {
                bins[random1] += 1;
            }
        }
        return bins;
    }
    // opgave 4
    
}

