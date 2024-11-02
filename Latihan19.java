/*
 * @author 
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika 
 * NIM      : 23215046
 * Deskripsi Program : Saldo Tabungan
 */ 

package Pertemuan6;

public class Latihan19 { 
    public static void main(String[] args) { 
       
        int saldoAwal = 2500000; //Penjelasan(1)
        double bunga = 0.15; //Penjelasan(2)
        int lamaMenabung = 6; 

        for (int i = 1; i <= lamaMenabung; i++) {
            saldoAwal += saldoAwal * bunga; //Penjelasan (3)
            System.out.printf("Saldo di bulan ke-%d Rp.%,d %n",i,saldoAwal);
            //Penjelasan(4)
        }              
    }
} 

/*PENJELASAN
  (1) Karena saya lihat hasil ouput yang diinginkan dalam soal tidak ada 
      pembulatan desimalnya, maka saya mendeklarasikan variabel saldoAwal
      bertipe data integer.
  (2) Bunga per bulan 15% (dalam double menjadi 0.15)
  (3) saldoAwal(integer) dikali dengan bunga(double) akan menghasilkan 
      nilai double, tetapi setelah ditambahkan ke variabel saldoAwal 
      dengan operator += maka otomatis hasilnya akan berubah menjadi integer
      sehingga angka di belakang koma otomatis hilang.
  (4) -Saya menggunakan formatter %d untuk memanggil variabel bertipe data integer, 
      yang mana digunakan untuk memanggil argumen dari i dan saldoAwal. 
      -Pada %,d sebetulnya merupakan formatter %d namun diberikan tanda koma yang 
      bertujuan untuk memisahkan digit ribuan pada angka dalam variabel saldoAwal. 
      -formatter %n digunakan untuk menampilkan output itarsi selanjutnya pada 
      baris teks yang berbeda. 
*/


    

