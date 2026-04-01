package tugas;

public class Mahasiswa23 {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa23(String nama, String nim, int tahun, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahun;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }
    
    static int[] cariMinMaxUTS(Mahasiswa23[] mhs, int l, int r) {
        if (l == r) {
            return new int[]{mhs[l].nilaiUTS, mhs[l].nilaiUTS};
        } else if (r - l == 1) {
            if (mhs[l].nilaiUTS < mhs[r].nilaiUTS) {
                return new int[]{mhs[l].nilaiUTS, mhs[r].nilaiUTS};
            } else {
                return new int[]{mhs[r].nilaiUTS, mhs[l].nilaiUTS};
            }
        }

        int mid = (l + r) / 2;
        int[] leftRes = cariMinMaxUTS(mhs, l, mid);
        int[] rightRes = cariMinMaxUTS(mhs, mid + 1, r);

        int min = (leftRes[0] < rightRes[0]) ? leftRes[0] : rightRes[0];
        int max = (leftRes[1] > rightRes[1]) ? leftRes[1] : rightRes[1];

        return new int[]{min, max};
    }

    static double hitungRataUAS(Mahasiswa23[] mhs) {
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].nilaiUAS; 
        }
        return total / mhs.length;
    }
}
