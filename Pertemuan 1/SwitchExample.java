/**
* Program berikut untuk mencoba seleksi switch-case
*/

 public class SwitchExample {
 public static void main(String[] args) {
 int number=20;
	switch(number){
  	 case 10: System.out.println("10");break;
	 case 20: System.out.println("20");break;
  	 case 30: System.out.println("30");break;
 
 default:System.out.println("Not in 10, 20 or 30");
	}
  }
}

/**
 penjelasanProgram diatas:
program diatas mencoba seleksi switch-case yang hanya akan memilih satu pernyataan saja.
	jadi output case pertama akan menampilkan '10' jika angka yang diberi 10,
	jadi output case akan menampilkan '10' jika angka yang diberi 20,
	jadi output case akan menampilkan '10' jika angka yang diberi 30,
	dan apabila angka yang diberi bukan 10,20,30, maka output akan beralih ke default.
pada program diatas output yang ditampilkan adalah '20'.
*/
