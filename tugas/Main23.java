package tugas;

public class Main23 {
    

    public static void main(String[] args) {
        Mahasiswa23[] daftarMhs = {
            new Mahasiswa23("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa23("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa23("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa23("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa23("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa23("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa23("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa23("Hadi", "220101008", 2020, 82, 84)
        };

        int[] hasilUTS = Mahasiswa23.cariMinMaxUTS(daftarMhs, 0, daftarMhs.length - 1);
        double rataUAS = Mahasiswa23.hitungRataUAS(daftarMhs);

        System.out.println("=== HASIL PENGOLAHAN NILAI MAHASISWA ===");
        System.out.println("Nilai UTS Tertinggi (DC) : " + hasilUTS[1]); 
        System.out.println("Nilai UTS Terendah  (DC) : " + hasilUTS[0]); 
        System.out.println("Rata-rata Nilai UAS (BF) : " + rataUAS);
    }
}
