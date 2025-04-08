public class MisteriKue{

    public static void main(String[] args) {
        String[] urutanTamu = {"Ningguang", "Hutao", "Xiao", "Childe"};
        boolean kueMasihAda = true;
        String pelaku = "Belum diketahui";

        for (String tamu : urutanTamu) {
            switch (tamu) {
                case "Ningguang":
                    System.out.println("Ningguang memeriksa kue. Kue masih ada.");
                    break;
                case "Hutao":
                    System.out.println("Hutao memberikan kado tanpa melihat kue.");
                    break;
                case "Xiao":
                    System.out.println("Xiao mengambil foto. Kue masih utuh dalam foto.");
                    break;
                case "Childe":
                    System.out.println("Childe meletakkan air mineral di meja.");
                    
                    kueMasihAda = false;
                    pelaku = "Childe";
                    break;
            }
        }

        System.out.println("\nHasil penyelidikan Yanfei:");
        if (!kueMasihAda) {
            System.out.println("Kue hilang setelah kunjungan terakhir. Pelaku yang paling mungkin: " + pelaku);
        } else {
            System.out.println("Tidak ditemukan pelaku yang mencurigakan.");
        }
    }
}
