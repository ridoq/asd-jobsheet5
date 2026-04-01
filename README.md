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