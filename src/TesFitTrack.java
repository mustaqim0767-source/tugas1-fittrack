public class TesFitTrack {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  PENGUJIAN SISTEM KEANGGOTAAN FITTRACK ");
        System.out.println("========================================\n");
        
        
        System.out.println("--- [UJI 1] Data Cacat pada Constructor ---");
        Member memberCacat = new Member("  ", "12345", "17-10-2026", "SuperVIP");
        System.out.println(memberCacat + "\n");

        // 2. Inisialisasi Array Member (Minimal 4 Objek)
        Member[] daftarMember = new Member[4];
        daftarMember[0] = new Member("Mustaqim", "081234567890", "17-08-2026", "VIP");
        daftarMember[1] = new Member("Budi Santoso", "082345678901", "01-09-2026", "Premium");
        daftarMember[2] = new Member("Siti Rahma", "083456789012", "10-10-2026", "Basic");
        daftarMember[3] = new Member("Ahmad Hanif", "085678901234", "15-10-2026");

        // 3. Uji Penolakan Setter Nilai Tidak Valid
        System.out.println("--- [UJI 2] Penolakan Setter Nilai Tidak Valid ---");
        System.out.println("Coba ubah no hp Mustaqim jadi '0812' (kurang dari 10 digit):");
        daftarMember[0].setNoTelepon("0812");
        System.out.println("No HP Mustaqim (tetap nilai lama): " + daftarMember[0].getNoTelepon() + "\n");

        // 4. Cetak Seluruh Data Member dari Array
        System.out.println("--- [UJI 3] Cetak Semua Member dari Array ---");
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println("Member ke-" + (i + 1) + ":");
            System.out.println(daftarMember[i] + "\n");
        }
    }
}