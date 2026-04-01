#   Percobaan 1

##  Soal

1.	Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
2.	Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!
3.	Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
4.	Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF()  dan faktorialDC()!

---

##  Jawaban

1.  if (n == 1): Berfungsi sebagai Base Case (kondisi berhenti). Tanpa ini, fungsi rekursif akan memanggil dirinya sendiri terus-menerus tanpa henti (infinite recursion). Sedangkan else: Berfungsi sebagai Recursion Call. Di bagian ini, masalah besar dipecah menjadi sub-masalah yang lebih kecil  sampai akhirnya mencapai Base Case.  
2.  Sangat memungkinkan karena bersifat iteratif.

    ```java
        int faktorialBF(int n) {
            int fakto = 1;
            int i = 1;
            while (i <= n) {
                fakto = fakto * i;
                i++;
            }
            return fakto;
        } 
    ```

3.  fakto *= i;: Digunakan dalam metode Brute Force (Iteratif). Nilai fakto diperbarui secara langsung di dalam sebuah loop dengan mengalikan nilai sebelumnya dengan angka iterasi saat itu.

Sedangkan int fakto = n * faktorialDC(n-1);: Digunakan dalam metode Divide and Conquer (Rekursif). Kode ini tidak langsung menghasilkan nilai akhir, melainkan memanggil kembali fungsi tersebut dengan parameter yang lebih kecil dan menunggu hasil pengembalian (return value) dari tumpukan memori (stack) sebelum dikalikan dengan n.
4.  faktorialBF() (Brute Force): Bekerja dengan pendekatan iteratif. Program menyelesaikan masalah secara langsung melalui tahapan yang berurutan (perulangan) dari awal hingga akhir untuk mendapatkan hasil.Sedangkan faktorialDC() (Divide and Conquer): Bekerja dengan pendekatan rekursif. Program memecah masalah besar menjadi bagian-bagian terkecil (Divide), menyelesaikannya secara mandiri (Conquer), dan kemudian menggabungkan hasilnya kembali (Combine) melalui pemanggilan fungsi itu sendiri.

---

#   Percobaan 2

## Soal

1.	Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
2.	Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
3.	Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?
4.	Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!

---
## Jawaban

1.  pangkatBF(): Menggunakan algoritma Brute Force dengan cara iteratif (perulangan for). Algoritma ini mengalikan angka basis sebanyak $n$ kali secara berurutan. Sedangkan pangkatDC(): Menggunakan algoritma Divide and Conquer dengan cara rekursif. Masalah dipecah menjadi bagian-bagian lebih kecil (dibagi dua) untuk mempercepat proses perhitungan.
2.  Ya, tahap combine sudah termasuk. Baris kode <mark>return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);</mark> untuk pangkat ganjil, dan <mark>return (pangkatDC(a, n/2) * pangkatDC(a, n/2)); </mark>untuk pangkat genap adalah bentuk penggabungan (combine) nilai-nilai hasil pembagian tersebut.
3.  Sebenarnya penggunaan parameter kurang relevan jika objek tersebut sudah memiliki atribut nilai dan pangkat yang diisi melalui konstruktor. Method tersebut bisa dibuat tanpa parameter dengan memanfaatkan atribut kelas (this.nilai dan this.pangkat). Contoh:

    ```java
        int pangkatBF() {
            int hasil = 1;
            for (int i = 0; i < pangkat; i++) {
                hasil = hasil * nilai;
            }
            return hasil;
        }
    ```
4.  pangkatBF(): Bekerja secara linear. Jika memangkatkan $a^n$, maka akan terjadi $n$ kali operasi perkalian dalam satu jalur perulangan. Sedangkan pangkatDC(): Bekerja dengan membagi pangkat ($n$) menjadi dua bagian secara terus-menerus ($n/2$) hingga mencapai base case. Ini jauh lebih efisien karena hasil perpangkatan yang sama tidak perlu dihitung ulang dari nol, melainkan dikombinasikan dari sub-masalah yang sudah diselesaikan.

---