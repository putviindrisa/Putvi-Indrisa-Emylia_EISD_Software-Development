import java.util.HashSet;

public class App{
    public static boolean hasDuplicates(int[] numbers) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            if (!uniqueNumbers.add(num)) { 
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] data = {20, 1, 3, 2, 4, 6, 8, 5, 7, 9, 11, 13, 15, 10, 12, 14, 16, 18, 20, 17, 19};
        System.out.println(hasDuplicates(data)); 
    }
}
