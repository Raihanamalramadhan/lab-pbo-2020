/** 
* Program berikut untuk mencoba seleksi if-else
*/

	public class IfElseExample {
	public static void main(String[] args) {
	int number=13;
	if(number%2==0){
		System.out.println("Angka genap");
	}else{
		System.out.println("Angka ganjil");
		}
	}
} 
/**
* penjelasan Program diatas:
jadi program di atas untuk mencoba seleksi if dengan keadaan yang mengembalikan nilai boolean jika bernilai true. 
namun jika nilai boolean yang dihasilkan false, maka pernyataan else yang akan dikerjakan.
makan pada program diatas, akan dihasilakn output 'Angka ganjil'.
hal ini dikarenakan modulo 13 dibagi 2 tidak sama dengan 0, sehingga nilai booleannya bernilai false.
maka dari itu output menampilkan pernyataan di dalam else tersebut.
*/
