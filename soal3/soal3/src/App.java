class MisteriKue {
    public static void main(String[] args) {
        
        String[] tamu = {"Ningguang", "Hutao", "Xiao", "Childe"};
        boolean kueMasihAda = true;
        String pelaku = "Tidak diketahui";
        
        for (String t : tamu) {
            if (t.equals("Xiao")) {
                
                System.out.println("Xiao mengambil foto, kue masih utuh.");
            } else if (t.equals("Childe")) {
                
                System.out.println("Childe masuk ke ruangan.");
                kueMasihAda = false; 
                pelaku = "Childe";
            }
        }
        
        
        if (!kueMasihAda) {
            System.out.println("Berdasarkan analisis, kemungkinan besar " + pelaku + " yang mengambil kue!");
        } else {
            System.out.println("Kasus belum terpecahkan!");
        }
    }
}

