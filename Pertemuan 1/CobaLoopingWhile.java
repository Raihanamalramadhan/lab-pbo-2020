/**
* Program berikut untuk mencoba looping while
*/

public class CobaLoopingWhile{
	public static void main(String arg[]){
	int i=0;
	while (i<10)
	{
		int j=0;
		while (j<i+1)
		{
			System.out.print('*');
			j++;
		}
		System.out.println();
		i++;
	}
}
} 

/**
* penejelasan:
jadi program di atas adalah looping while.
looping while digunakan untuk perulangan yang jumlhnya belum diketahui pasti.
pada program diatas, sama seperti looping for, program akan melakukan perulangan sebanyak 10 kali karena adanya perintah while i<10
sehingga output akan menampilkan * sebanyak 10 baris dan tiap melakukan perulangan jumlah* akan bertambah 1.
*/