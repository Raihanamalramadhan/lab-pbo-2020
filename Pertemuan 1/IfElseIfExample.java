/**
* Program berikut untuk mencoba seleksi if-else if
*/

 public class IfElseIfExample {
 public static void main(String[] args) {
 int marks=65;

	if(marks<50){
		System.out.println("fail");
	}
	else if(marks>=50 && marks<60){
		System.out.println("D grade");
	}
	else if(marks>=60 && marks<70){
		System.out.println("C grade");
	}
	else if(marks>=70 && marks<80){
		System.out.println("B grade");
	}
	else if(marks>=80 && marks<90){
		System.out.println("A grade"); 
	}	
	else if(marks>=90 && marks<100){
		System.out.println("A+ grade");
	}else{
	System.out.println("Invalid!");
	}
 }
} 

/* penjelasan program:
jadi Pada program ini ditampilkan seleksi if  yang mengembalikan nilai boolean jika bernilai true. 
yang pertma output akan menampilkan 'fail' jika nilai kurang dari 50,
yang kedua output akan menampilkan 'D grade' jika nilai 50 hingga 59,
yang ketiga output akan menampilkan 'C grade' jika nilai 60 hingga 69,
yang keempat output akan menampilkan 'B grade' jika nilai 70 hingga 79,
yang kelima output akan menampilkan 'A grade' jika nilai 80 hingga 89,
yang keenam output akan menampilkan 'A+ grade' jika nilai 90 hingga 99,
 tapi berdasarkan pada program diatas, output yang ditampilkan adalah 'C grade', karena nilai yang di deklarasikan 65.
	65 >= 60 dan 65 < 70
	maka yang akan dicetak adalah C grade
*/