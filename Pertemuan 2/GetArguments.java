/** 
 * Program berikut untuk mendapatkan nilai argumen pada method main
*/ 
public class GetArguments {
 	public static void main(String args[]) { 
 
 	System.out.println("Tanggal : " + args[0]); 
	System.out.println("Bulan : " + args[1]); 
	System.out.println("Tahun : " + args[2]); 
 
	} 
}

/* penjelasan: 
jadi suatu Method main memiliki parameter berupa array bertipe String. 
nah ternyata Berapapun argumen yang diketik saat running, akan disimpan dalam 
array tersebut dan diakses dengan menggunakan indeks. 
	lalu apabila ingin menjalankannya memasukkan dengan argumen tanggal, bulan dan tahun. 
	cara ketik : java GetArguments "argument yang akan dimasukkan"

		contoh : java GetArguments 04 desember 2001
		maka, 04 akan disimpan pada args[0] (tanggal)
			  desember akan disimpan pada args[0] (bulan)
			  dan 2001 akan disimpan pada args[0] (tahun)
	kesimpulan: berapa pun yang di isi akan muncul.
*/
