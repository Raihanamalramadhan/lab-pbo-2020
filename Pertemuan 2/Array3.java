public class Array3 {
	public static void main(String args[]){

int [][] arrx= new int [3][3];
arrx [0][0]=1;
arrx [0][1]=2;
arrx [0][2]=3;
arrx [1][0]=4;
arrx [1][1]=5;
arrx [1][2]=6;
arrx [2][0]=7;
arrx [2][1]=8;
arrx [2][2]=9;

System.out.println("Nilai arrx[0][0] : " + arrx[0][0]);
System.out.println("Nilai arrx[0][1] : " + arrx[0][1]);
System.out.println("Nilai arrx[0][2] : " + arrx[0][2]);
System.out.println("Nilai arrx[1][0] : " + arrx[1][0]);
System.out.println("Nilai arrx[1][1] : " + arrx[1][1]);
System.out.println("Nilai arrx[1][2] : " + arrx[1][2]);
System.out.println("Nilai arrx[2][0] : " + arrx[2][0]);
System.out.println("Nilai arrx[2][1] : " + arrx[2][1]);
System.out.println("Nilai arrx[2][2] : " + arrx[2][2]);

int sum=0;
for (int[] arrxs: arrx){
    for (int arrxss: arrxs){
          sum+=arrxss;
            }
        }
        System.out.println("\nJumlah elemen array : "+sum);

	}
}

/*penjelasan :
diketahui
int [][] arrx= new int [3][3];
  int [3][3] arrx= { [0][1][2]
 			               [0][1][2]}

System.out.println("Nilai arrx[0][0] : " + arrx[0][0]); >>>>output nilai elemen array indeks [0][0] adalah 1 
System.out.println("Nilai arrx[0][1] : " + arrx[0][1]); >>>>output nilai elemen array indeks [0][1] adalah 2
System.out.println("Nilai arrx[0][2] : " + arrx[0][2]); >>>>output nilai elemen array indeks [0][2] adalah 3
System.out.println("Nilai arrx[1][0] : " + arrx[1][0]); >>>>output nilai elemen array indeks [1][0] adalah 4
System.out.println("Nilai arrx[1][1] : " + arrx[1][1]); >>>>output nilai elemen array indeks [1][1] adalah 5
System.out.println("Nilai arrx[1][2] : " + arrx[1][2]); >>>>output nilai elemen array indeks [1][2] adalah 6
System.out.println("Nilai arrx[2][0] : " + arrx[2][0]); >>>>output nilai elemen array indeks [2][0] adalah 7
System.out.println("Nilai arrx[2][1] : " + arrx[2][1]); >>>>output nilai elemen array indeks [2][1] adalah 8
System.out.println("Nilai arrx[2][2] : " + arrx[2][2]); >>>>output nilai elemen array indeks [2][2] adalah 9

apabila semua elemen diketahui diketahui maka dilakukan looping for each:
for (int[] arrxs: arrx)       {untuk memindahkan semua data dari Array 2 dimensi arrx ke array 1 dimensi arrxs}
    for (int arrxss: arrxs)   {untuk memindahkan semua data dari Array arrxs ke arrxss} 
          sum+=arrxss;        {menjumlahkan semua nilai elemen dari tiap array sampai batas panjang arrxss lalu disimpan kedalam variabel sum yang awalnya 0}
            }

alkhirnya menghasilkan output =45 
*/