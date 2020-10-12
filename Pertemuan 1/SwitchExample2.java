/**
* Program berikut untuk mencoba jika break tertinggal pada pernyataan
* case
*/

 public class SwitchExample2 {
 public static void main(String[] args) {
 int number=20;
 switch(number){
	case 10: System.out.println("10");
	case 20: System.out.println("20");
	case 30: System.out.println("30");
 default:System.out.println("Not in 10, 20 or 30");
		}
	}
}

/**
* penjelasan program di atas:
jadi pada program tersebut tidak ditulis break. sehingga jawaban tidak terhenti di satu pilihan.
sehingga pada program ini output yang dihasilkan adalah 20,30,not in 10,20, or 30. 
*/
