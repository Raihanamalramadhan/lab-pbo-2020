/**
* Program berikut untuk mencoba operator logika
*/
	public class prak3Lat5 {
 	public static void main(String args[]) {
 		boolean a = true;
 		boolean b = false;
 
 	System.out.println("a && b = " + (a&&b));
 	System.out.println("a || b = " + (a||b) );

 	System.out.println("!(a && b) = " + !(a && b));
 	}
}
/*
 	Penjelasan:
 		jadi program diatas menggunakan operator logika diketahui boolen a = true, boolean b=false
      hasil:
      1. a && b, && merupakan operator logika AND. Kedua operand haruslah bernilai true, barulah 
 			nilai yang dikembalikan true. dan outputnya adalah false 
 	  2. a || b,  merupakan operator logika OR. Kedua operand bernilai false, barulah nilai yang dikembalikan false. 
 	  		dan outputnya adalah true 
	  3. !(a && b), merupakan operator logika NOT. Operator yang digunakan untuk membalikkan nilai boolean. 
	  		Awalnya a && b adalah false, maka setelah dipakai operator ! maka akan jadi true
 
*/ 
