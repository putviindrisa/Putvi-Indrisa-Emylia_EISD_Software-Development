public class UsernameNaip {
    public static void main(String[] args) {
        String namaLengkap = "Naip Lovyu";
        String namaGabung = namaLengkap.replaceAll("\\s+", "").toLowerCase(); 
        int maxLength = 6;
        int totalKombinasi = 0;

        System.out.println("Nama gabungan (untuk username): " + namaGabung);

        for (int panjang = 1; panjang <= maxLength; panjang++) {
            for (int i = 0; i <= namaGabung.length() - panjang; i++) {
                String kombinasi = namaGabung.substring(i, i + panjang);
                System.out.println(kombinasi); 
                totalKombinasi++;
            }
        }

        System.out.println("\nTotal kombinasi username yang mungkin: " + totalKombinasi);
    }
}
