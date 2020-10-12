/**
* Program berikut untuk mencoba pemakaian label pada break
*/

	public class Smallest{
	public static void main(String arg[]){
		int a, b;
		Mulai:
			for(a=0; a<2; a++){
				for(b=0; b<3; b++)
				{
					if(b==2)
					break Mulai;
						System.out.println("a=" + a + " ; b=" + b);
				}
			}
		}
	}

/*
penjelasan:
berhubung a<2 maka hanya 0 dan 1. jdi prosesnya yaitu
 a=0, karena a<2, cetak a=0, masuk ke b=0, karena b<3, simpan b=0+1, simpan a=0+1
 a=1, karena a<2, cetak a=0, masuk ke b=1, karena b<3, simpan b=1+1, simpan a=1+1
 dan akhirnya berhenti looping karena hanya sampai 1.
*/
