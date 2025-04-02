public class App{
    public static void main(String[] args) {
        String name = "naiplovyu"; 
        int n = name.length();
        int maxLength = 6;
        int totalCombinations = 0;

        
        for (int k = 1; k <= maxLength; k++) {
            totalCombinations += (n - k + 1);
        }

       
        System.out.println("Total kombinasi username yang mungkin: " + totalCombinations);
    }
}
