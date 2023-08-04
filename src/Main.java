import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] counts = {3, 20, 5, 7, 3, 19, 84, 45, 100};
        task1(counts);
        task2(counts);
    }

    public static void task1(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] % 2 == 0) {
                counts[i] = counts[i] + 1;
            }
        }
        for (int i = 2; i < 7; i++) {
            System.out.println(counts[i]);
        }
    }

    public static void task2(int[] counts) {
        Arrays.stream(counts)
                .map(num -> num % 2 == 0 ? num + 1 : num)
                .limit(7).skip(2)
                .forEach(num -> System.out.print(num + " "));
    }
}