# FP_PBO
 Final Project PBO
### Anggota Kelompok 3
| Nama                         | NRP        |
| ---------------------------- | -----------|
| Yohanes Teguh Ukur Ginting   | 5025211179 |
| Shazia Ingeyla Naveeda       | 5025211203 |
| Armadya Hermawan Sarowono    | 5025211243 |



### Apa itu _Inverse Grid Game_?
Inverse Grid Game adalah sebuah puzzle dimana disetiap cell dalam game akan bernilai 0 lalu tujuan dari game tersebut adalah untuk mengubah semua warna cell yang 
bernilai 0 menjadi nomor 1 yang menyebabkan warna cell tersebut berubah


### Fitur-fitur dalam **_Inverse Grid Game_**
Dalam pengerjaan FP ini, kami mengikuti tutorial dari [JavaFX Game: Inverse Grid](https://www.youtube.com/watch?v=nmkrLb1pVGA&t=310s)
| Features                | Inverse Grid Game | JavaFX Game: Inverse Grid |
| ----------------------- | -- | -- |
| Pembuatan Cell          | <p align="center"> ✓ </p> | <p align="center"> ✓ </p> |  
| Penggantian Warna Cell  | <p align="center"> ✓ </p> | <p align="center"> ✓ </p> |  
| Pembuatan Tampilan Game | <p align="center"> ✓ </p> | <p align="center"> ✓ </p> |  
| Main Menu               | <p align="center"> ✓ </p> |   |  
| About Menu              | <p align="center"> ✓ </p> |   |  
| Loading Screen          | <p align="center"> ✓ </p> |   |  
| Info Anggota Kelompok   | <p align="center"> ✓ </p> |   |  
| In Game Music           | <p align="center"> ✓ </p> |   |  
| In Menu Music           | <p align="center"> ✓ </p> |   |
| Tampilan UI lebih Baik  | <p align="center"> ✓ </p> |   |



### Class dalam _Invers Grid Game_
- `Main` main class dimana berisi class yang akan digunakan untuk mengampilkan tampilan gamenya. Class yang ada di dalam class ini berisi pengatur file-file FXML resources yang digunakan, class untuk memainkan lagu pada game, class untuk memulai dan mengatur main menu, class untuk loading scene.

- `ViewManager` Class dimana yang mengatur jalannya tampilan pada main menu dan apa yang terjadi saat menu button tersebut di tekan dimana yang berhubungan dengan class yang lainnya dan menampilkan background, logo dan effect saat pointer mouse melewati tombol dan logo InversGrid dan juga mengatur bagaimana subscene muncul dan menghilang tergantung dengan keadaan primary stage

-  `MusicMenu` Class yang digunakan untuk mengatur background music/music yang digunakan pada game dan setop dan memulainya musik pada aplikasi.

-  Pada `gamenya/` terdapat `Cell` dan `GameInvernya` dimana class `GameInvernya` dan `Cell` adalah class yang dimana digunakan untuk membuat game InversGrid tersebut sesuai dengan tutorial video dimana class `Cell` adalah class untuk membuat setiap cell dan `GameInvernya` adalah class untuk membuat grid dan membuat gamenya.

- `loadingScreenController` class dimana yang digunakan untuk menampilkan video / loading screen yang digunakan saat app dijalankan yang digunakan pada class `Main`.

- `ButtonGame` Class yang digunakan untuk membuat button game yang digunakan pada class `ViewManager` yaitu main menu yang membuat tombol-tombol tersebut bisa ditekan.

- `GameSubScene` Class yang digunakan untuk membuat subscene yang digunakan pada saat tombol About yang diatur oleh `ButtonGame` dan `ViewManager` dimana yang ditampilkan adalah about subscene dimana menjelaskan mengenai game yang sedang dimainkan.

- `KelompokSubScene` Class yang digunakan untuk membuat subscene yang digunakan pada saat tombol Kelompok yang diatur oleh `ButtonGame` dan `ViewManager` dimana yang ditampilkan adalah kelompok subscene dimana menampilkan tampilan nama anggota kelompok yang mengerjakan.

- Pada package `view` dan `model` terdapat `resources` dimana berisi kebutuhan kebutuhan yang dibutuhkan aplikasi seperti file fxml, ttf berupa font, png berupa gambar, wav berupa lagu/music yang digunakan, dan .gif digunakan pada gambar loading screen di awal app dibuka.



### Tools Yang Digunakan dalam pengerjaan _Inverse Grid Game_
- JavaFX
- IDE - VSCode
- SceneBuilder
- GitHub Desktop
- Canva
- Adobe Illustrator
- Adobe Premiere Pro



### Perbandingan Tampilan _Inverse Grid Game_ dengan Tutorial Referensi

| Invers Grid Game                    | JavaFX Game: Inverse Grid       |
| ---------------------------- | -------------------------------|
|![gambarafter1](https://user-images.githubusercontent.com/116735029/208305197-9609fec9-ca1f-4d25-b745-8259afb14939.jpeg)  |![gambarbefore1](https://user-images.githubusercontent.com/116735029/208305249-a228cbb3-6bf9-4a2f-9664-8421bdaead4a.jpeg)|
|![gambarafter2](https://user-images.githubusercontent.com/116735029/208305396-923227e2-79bf-4af3-b833-c1eb14ac1704.jpeg) | |



### Insights pada pengerjaan _Inverse Grid Game_

| _Commits_                  | _Deletion_       |
| ---------------------------- | -------------------------------|
|![commits](https://user-images.githubusercontent.com/114483889/208305745-68d3eea7-6986-44ed-bb38-6b97b329f166.jpeg) | ![deletion](https://user-images.githubusercontent.com/114483889/208305816-b1c7afa0-2de8-4eff-8665-6fc4275acc54.jpeg)|



![persentasi](https://user-images.githubusercontent.com/116735029/208307226-498dd737-f515-491c-be93-1f5f5ff0189c.jpeg)
