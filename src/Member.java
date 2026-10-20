public class Member {
    private static final int MIN_PHONE_LENGTH = 10;
    private static final String PHONE_PREFIX = "0";
    
    private static final String DEFAULT_NAMA = "Member Tanpa Nama";
    private static final String DEFAULT_NO_TELEPON = "00000000000";
    private static final String DEFAULT_TANGGAL = "01-01-2026";
    private static final String DEFAULT_JENIS_PAKET = "Basic";

    private String nama, noTelepon, tanggalDaftar, jenisPaket;

    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    public String getNama() { return nama; }
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama.trim();
        } else {
            System.out.println("[Penolakan Validasi] Nama tidak boleh kosong!");
            if (this.nama == null) this.nama = DEFAULT_NAMA;
        }
    }

    public String getNoTelepon() { return noTelepon; }
    public void setNoTelepon(String noTelepon) {
        if (noTelepon != null && noTelepon.startsWith(PHONE_PREFIX) && noTelepon.length() >= MIN_PHONE_LENGTH && noTelepon.matches("\\d+")) {
            this.noTelepon = noTelepon;
        } else {
            System.out.println("[Penolakan Validasi] Nomor telepon harus diawali 0 dan minimal 10 digit!");
            if (this.noTelepon == null) this.noTelepon = DEFAULT_NO_TELEPON;
        }
    }

    public String getTanggalDaftar() { return tanggalDaftar; }
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar != null && !tanggalDaftar.trim().isEmpty()) {
            this.tanggalDaftar = tanggalDaftar.trim();
        } else {
            System.out.println("[Penolakan Validasi] Tanggal daftar tidak boleh kosong!");
            if (this.tanggalDaftar == null) this.tanggalDaftar = DEFAULT_TANGGAL;
        }
    }

    public String getJenisPaket() { return jenisPaket; }
    public void setJenisPaket(String jenisPaket) {
        if (jenisPaket != null && (jenisPaket.equals("Basic") || jenisPaket.equals("Premium") || jenisPaket.equals("VIP"))) {
            this.jenisPaket = jenisPaket;
        } else {
            System.out.println("[Penolakan Validasi] Jenis paket harus Basic, Premium, atau VIP!");
            if (this.jenisPaket == null) this.jenisPaket = DEFAULT_JENIS_PAKET;
        }
    }
}

@Override
    public String toString() {
        return String.format(
            "----------------------------------------\n" +
            "Nama           : %s\n" +
            "No. Telepon    : %s\n" +
            "Tanggal Daftar : %s\n" +
            "Jenis Paket    : %s\n" +
            "----------------------------------------",
            nama, noTelepon, tanggalDaftar, jenisPaket
        );
    }
}