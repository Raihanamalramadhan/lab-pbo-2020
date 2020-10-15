/** 
 * Program berikut untuk melihat panjang array
*/ 
public class CariPanjangElemen {
 	public static void main(String args[]) { 
 		int x[][][][]=new int[2][][][]; 
		x[0]=new int[1][][]; 
		x[0][0]=new int[2][]; 
		x[0][0][0]=new int[3]; 
		x[0][0][1]=new int[2];  
		x[1]=new int[2][][]; 
		x[1][0]=new int[1][];  
		x[1][0][0]=new int[2]; 
		x[1][1]=new int[2][]; 
		x[1][1][0]=new int[1]; 
		x[1][1][1]=new int[3]; 
 
		System.out.println(x.length); 
		System.out.println(x[0].length); 
		System.out.println(x[0][0].length); 
		System.out.println(x[0][0][0].length); 
		System.out.println(x[0][0][1].length); 
		System.out.println(); 
		System.out.println(x[1].length); 
		System.out.println(x[1][0].length); 
		System.out.println(x[1][0][0].length);  
		System.out.println(x[1][1].length); 
		System.out.println(x[1][1][0].length); 
		System.out.println(x[1][1][1].length); 
		 
	} 
} 

/* penjelasan masing-masing baris:
 pertama System.out.println(x.length);  >>>>>>output menghasilkan 2 karena variabel x elemennya terisi 2
 kedua System.out.println(x[0].length); >>>>>output menghasilkan 1 karena variabel x[0] elemennya terisi 1
 ketiga System.out.println(x[0][0].length); >>>>>output menghasilkan 2 karena variabel x[0][0] elemennya terisi 2
 keempat System.out.println(x[0][0][0].length);>>>>>output menghasilkan 3 karena variabel x[0][0][0] elemennya terisi  3
 kelima System.out.println(x[0][0][1].length); >>>>output menghasilkan 2 karena variabel x[0][0][1] elemennya terisi  2
 keenam System.out.println(x[1].length); >>>>>output menghasilkan 2 karena variabel x[1] elemennya terisi 2
 ketujuh System.out.println(x[1][0].length); >>>>> output menghasilkan 1 karena variabel x[1][0] elemennya terisi 1
 kedelapan System.out.println(x[1][0][0].length); >>>>>output menghasilkan 2 karena variabel x[1][0][0] elemennya terisi 2
 kesembilan System.out.println(x[1][1].length); >>>>> output menghasilkan 2 karena variabel x[1][1] elemennya terisi 2
 kesepuluh System.out.println(x[1][1][0].length); >>>>> output menghasilkan 1 karena variabel x[1][1][0] elemennya terisi 1
 kesebelas System.out.println(x[1][1][1].length); >>>>> output menghasilkan 3 karena variabel x[1][1][1] elemennya terisi 3
*/