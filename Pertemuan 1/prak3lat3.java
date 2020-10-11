/**
* Program berikut untuk mencoba operator relasional
*/

public class prak3Lat3 {
 	public static void main(String args[]) {
 	int a = 10;
 	int b = 20;
 
 		System.out.println("a == b = " + (a == b) );
 		System.out.println("a != b = " + (a != b) );
 		System.out.println("a > b = " + (a > b) );
 		System.out.println("a < b = " + (a < b) );
 		System.out.println("b >= a = " + (b >= a) );
 		System.out.println("b <= a = " + (b <= a) );
 	}
}

/*Penjelasan diatas:
 	Program diatas merupakan kode tentang operator realtional, Yang digunakan untuk 
 membandingkan nilai dari dua operand. Hasil perbandingan dinyatakan dalam nilai boolean. 
 Nilai boolean true berarti benar dan false berarti salah. 
	jadi diketahui a=10 dan b =20. maka hasil dari masing-masing yaitu:
 1. a == b, untuk menguji apakah nilai a samadengan b, maka didapatkan outputnya False karena 10 tidak sama dengan 20
 2. a != b, untuk menguji apakah nilai a tidak sama dengan b, maka didapatkan outputnya True, karena 10 memang iya tidak sama dengan 20
 3. a > b,  untuk menguji apakah nilai a lebih besar daripada b, maka outputnya adalah False , karena 10 tidak lebih besar daripada 20
 4. a < b,  untuk menguji apakah nilai a lebih kecil daripada b, maka outputnya adalah True, karena 10 lebih kecil daripada 20
 5. b >= a, untuk menguji apakah nilai b lebih besar sama dengan a, maka outputnya adalah true , karena 20 lebih besar sama dengan 10
 6. b <= a, untuk menguji apakah nilai b lebih kecil sama dengan a, maka outputnya adalah false , karena 20 tidak lebih kecil sama dengan 10
*/
