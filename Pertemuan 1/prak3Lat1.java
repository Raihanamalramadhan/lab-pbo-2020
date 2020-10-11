/**
* Program berikut untuk mencoba operator aritmetika
*/

public class prak3Lat1 {
 
 	public static void main(String args[]) {
 	int a = 10;
 	int b = 20;
 	int c = 25;
 	int d = 25;
 
 	System.out.println("a + b = " + (a + b) );
 	System.out.println("a - b = " + (a - b) );
 	System.out.println("a * b = " + (a * b) );
 	System.out.println("b / a = " + (b / a) );
 	System.out.println("b % a = " + (b % a) );
 	System.out.println("c % a = " + (c % a) );
 	System.out.println("a++ = " + (a++) );
 	System.out.println("b-- = " + (a--) );

 // Check the difference in d++ and ++d

	 System.out.println("d++ = " + (d++) );   // diprint d=25 yang disimpan d=> 25+1=26
 	 System.out.println("++d = " + (++d) );   // dprint d=> 26+1=27
	 }
}
/* Penjelasan:
		Program diatas menggunakan beberapa operator aritmetika yaitu, +,-,*,/,%,++,--
		dimana variabel a mempunyai nilai 10, b=20, c=25, d=25.
			Pada baris pertama akan ditemapilkan output dari variabel a + b yaitu 10+20 = 30.
			Pada baris kedua akan ditampilkan output dari a-b yaitu 10-20=-10
			Pada baris ketiga akan ditampilkan output dari a*b yaitu 10*20 = 200
			Pada baris keempat akan ditampilkan output dari b/a yaitu 20/10= 2
			Pada baris kelima akan ditampilkan output dari b%a yaitu 20%10 =0
			Pada baris keenam akan ditampilkan output dari c%aa yaitu 25%10 =5
			Pada baris ketujuh akan ditampilkan output incremen ++, yang mempunyai
				fungsi untuk menambahkan angka dengan 1, namum karena kita akan menampilkan a++, 
				maka nilai a akan ditamilkan terlebih dahulu baru di tambah dengan 1 sehingga
				menghasilkan angka dari variabel a yaitu a=10, tetapi sebenarnya itu sudah bertambah 1
			Pada baris kedelapan akan ditampilkan output (decrement) yaitu -- yang pertama dimana 
				nilai untuk b di ambil nilai variabel a pada baris sebelumnya , sehingga outputnya adalah
				nilai a yg telah di post-icrement kan menjadi 11, maksdnya nilai nya akan ditambah operan 1
			Pada baris kesembilan , (proses ini adalah increment yang akan di postincrement atau d akan 
				menampilkan nilainya terlebih dahulu baru akan ditambahkan 1 nilai sehingga nilainya adalah 25)
			Pada baris kesepuluh output yang dihasilkan adalah 27, karena proses ini adalah incremet dalam 
					bentuk pre-increment. sebelumnya variabel d telah mendapat postincrement yang membuat nilai d 
					menjadi 26, dan pada proses ini d kembali mendapat preincrement sehingga d akan menambah 1
					sehingga hasilnya 27 mendapat preincrement yaitu variabel d akan langsung mendapat penambahan  
					1 sehinnga hasil akhirnya adalah 27 
*/