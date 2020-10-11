/**
* Program berikut untuk mencoba operator conditional
*/

public class prak3Lat6 {
 public static void main(String args[]) {
 	int a, b;
 	a = 10;
 	b = (a == 1) ? 20: 30;
 		System.out.println( "Value of b is : " + b );
 	b = (a == 10) ? 20: 30;
 		System.out.println( "Value of b is : " + b );
 	}
}

/*
 	Penjelasan:
 		program diatas menggunakan operator conditional, Operator ini digunakan untuk mengecek ekspresi boolean, 
 jika true maka yang dipilih sebelah kiri, jika false maka yang dipilih yang sebelah kanan.
 Baris pertama 10 tidak sama dengan 1 maka akan dicetak yang sebelah kanan yaitu 30
 Baris kedua karena 10 sama dengan 10 maka akan dicetak yang sebelah kiri yaitu 20
*/
