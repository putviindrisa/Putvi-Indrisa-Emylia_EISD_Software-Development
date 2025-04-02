import java.util.*;

public class soal1 {
    public static String ratingSummary(double[] ratings) {
        double min = Arrays.stream(ratings).min().orElse(0);
        double max = Arrays.stream(ratings).max().orElse(0);
        double avg = Arrays.stream(ratings).average().orElse(0);
        return String.format("[%.1f, %.1f, %.1f]", min, max, avg);
    }

    public static void main(String[] args) {
        double[] ratings1 = {4.5, 2.0, 1.5, 3.0, 2.5, 4.0, 5.0, 3.5, 2.0, 1.0};
        double[] ratings2 = {5, 4, 2.5, 5, 3.6, 1.1, 3.6, 4, 4.2, 1.5};
        
        System.out.println(ratingSummary(ratings1)); // Output: [1.5, 5.0, 2.9]
        System.out.println(ratingSummary(ratings2)); // Output sesuai dengan hasil perhitungan
    }
}
