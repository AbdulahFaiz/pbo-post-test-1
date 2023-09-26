# pbo-post-test-1
Abdulah Faiz Tedjo Putro (2209116026)
Sistem Informasi A 2022


## Kelas Smartphone

### Property
![image](https://github.com/AbdulahFaiz/pbo-post-test-1/assets/121870536/5cdec6d0-45e9-4355-9bbe-b4f25d0275cf)

Terdapat sebuah kelas bernama "Smartphone". Kelas ini memiliki beberapa properti atau atribut yang digunakan untuk merepresentasikan informasi tentang sebuah smartphone. Berikut adalah penjelasan singkat tentang setiap bagian dari kode tersebut:

* Public class Smartphone {: Baris pertama kode ini mendefinisikan sebuah kelas bernama "Smartphone". Kode di dalam kurung kurawal {} akan berisi properti dan metode yang akan digunakan untuk mewakili dan memanipulasi objek smartphone.

* Properti: Kelas Smartphone memiliki empat properti yang digunakan untuk menyimpan informasi tentang sebuah smartphone.


  - public String brand;: Ini adalah properti yang menyimpan informasi tentang merek (brand) smartphone. Properti ini menggunakan tipe data String, yang berarti nilai yang disimpan adalah teks.

  - public String model;: Properti ini menyimpan informasi tentang model smartphone.

  - public int kapasitasMemory;: Properti ini menyimpan informasi tentang kapasitas memori smartphone dalam bentuk angka bulat (integer).

  - public int harga;: Properti ini menyimpan informasi tentang harga smartphone dalam bentuk angka bulat (integer).


* Setiap properti dideklarasikan sebagai "public", yang berarti mereka dapat diakses dari luar kelas Smartphone. Ini memungkinkan objek lain untuk membaca dan mengubah nilai-nilai properti ini langsung.



### Constructor
![image](https://github.com/AbdulahFaiz/pbo-post-test-1/assets/121870536/bfee617a-3e01-4765-88d3-40eb193bb787)

* Constructor merupakan metode khusus dalam sebuah kelas yang digunakan untuk menginisialisasi objek yang dibuat dari kelas tersebut.
* Dalam konteks kelas "Smartphone", constructor ini memiliki nama yang sama dengan nama kelasnya, yaitu "Smartphone". Ini adalah konvensi dalam bahasa pemrograman Java.
* Constructor menerima empat parameter: brand, model, kapasitasMemory, dan harga. Parameter-parameter ini digunakan untuk memberikan nilai awal pada properti-properti objek yang baru dibuat.
* Setiap parameter digunakan untuk menginisialisasi properti yang sesuai dalam objek baru. Sebagai contoh, nilai dari parameter brand akan diassign ke properti brand dalam objek yang dibuat, dan hal yang sama berlaku untuk parameter lainnya.
* Kata kunci this digunakan untuk merujuk pada properti-properti dalam objek saat ini, membedakan antara parameter constructor dan properti objek. Dengan kata lain, this.brand merujuk pada properti brand dalam objek yang sedang dibuat.


### Method displayinfo
![image](https://github.com/AbdulahFaiz/pbo-post-test-1/assets/121870536/35944db7-e370-4564-b64b-e793c62b43d2)

* Ini adalah sebuah method dalam kelas "Smartphone" yang disebut displayInfo. Method ini bertugas untuk menampilkan informasi tentang objek smartphone yang sesuai dengan properti-propertinya.
* Method ini tidak mengembalikan nilai (void), yang berarti ia hanya digunakan untuk mengeksekusi tugas tertentu dan tidak mengembalikan hasil.
* Ketika method displayInfo dipanggil pada sebuah objek dari kelas "Smartphone", ia akan mencetak informasi tentang smartphone ke layar melalui perintah-perintah System.out.println.
* Informasi yang dicetak meliputi merek (brand), model (model), kapasitas penyimpanan (kapasitasMemory) dalam gigabyte (GB), dan harga (harga) dalam mata uang Rupiah (Rp.).
* Setiap informasi ditampilkan dalam format yang sesuai dengan konteksnya, misalnya merek dan model ditampilkan sebagai teks, kapasitas penyimpanan ditampilkan dengan satuan GB, dan harga ditampilkan dengan simbol mata uang Rupiah. Setiap informasi akan dipisahkan dengan baris kosong setelahnya agar tampilan output menjadi lebih terstruktur.


## Main

### ArrayList

![image](https://github.com/AbdulahFaiz/pbo-post-test-1/assets/121870536/236f22fc-070f-4dea-919c-657ce65e229b)

import java.util.ArrayList; adalah pernyataan impor dalam bahasa pemrograman Java. Ini digunakan untuk mengimpor kelas ArrayList dari paket java.util ke dalam program Java


### Inisialisai ArrayList
![image](https://github.com/AbdulahFaiz/pbo-post-test-1/assets/121870536/55d91fac-0788-4e29-8378-f257d132477e)

Pernyataan yang digunakan untuk membuat sebuah objek ArrayList yang akan menyimpan objek-objek dari kelas Smartphone


### Menambah objek ke ArrayList
![image](https://github.com/AbdulahFaiz/pbo-post-test-1/assets/121870536/ef3c64d0-5ea9-4c17-a65d-89951102b08e)

Ini merupakan bagian di mana objek Smartphone dibuat dan ditambahkan ke dalam ArrayList 'smartphone' menggunakan metode 'add'. Setiap objek smartphone dibuat dengan menggunakan konstruktor kelas 'Smartphone' dan kemudian ditambahkan ke dalam ArrayList.


### Perulangan
![image](https://github.com/AbdulahFaiz/pbo-post-test-1/assets/121870536/c0300b13-0137-48d0-9853-5357feb9589e)

Berikut merupakan perulangan (loop) khusus dalam bahasa pemrograman Java yang disebut "for-each loop" atau juga dikenal sebagai "enhanced for loop". Perulangan ini digunakan untuk mengakses dan melakukan operasi pada setiap elemen dalam koleksi, seperti ArrayList, tanpa harus mengkhawatirkan indeks atau iterasi manual.


## Output
![image](https://github.com/AbdulahFaiz/pbo-post-test-1/assets/121870536/cec626ea-a50b-4abd-90ee-dffd0d6064d8)

Hasil dari program java yang telah dibuat, akan menghasilkkan output seperti pada gambar diatas



