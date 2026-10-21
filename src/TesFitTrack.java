public class TesFitTrack {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  PENGUJIAN SISTEM KEANGGOTAAN FITTRACK ");
        System.out.println("========================================\n");

        // Membuat array bertipe Member (minimal 4 objek)
        Member[] daftarMember = new Member[4];

        // Inisialisasi objek Member
        daftarMember[0] = new Member("Mustaqim", "081234567890", "17-08-2026", "VIP");
        daftarMember[1] = new Member("Budi Santoso", "082345678901", "01-09-2026", "Premium");
        daftarMember[2] = new Member("Siti Rahma", "083456789012", "10-10-2026", "Basic");
        daftarMember[3] = new Member("Ahmad Hanif", "085678901234", "15-10-2026"); // Memakai constructor 3 parameter

        // Mencetak seluruh data member memakai perulangan for
        System.out.println("--- DAFTAR MEMBER FITTRACK ---");
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println("Member ke-" + (i + 1) + ":");
            System.out.println(daftarMember[i]);
            System.out.println();
        }
    }
}