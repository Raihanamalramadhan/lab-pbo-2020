/**
* Program berikut untuk mencoba switch-case pada String
*/

public class SwitchExample3 {
public static void main(String[] args) {
	String dayOfWeekArg = "Thursday";
	String typeOfDay = "";
	
		switch (dayOfWeekArg) {
		case "Monday":
		typeOfDay = "Start of work week";
		break;

		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		typeOfDay = "Midweek";
		break;

		case "Friday":
		typeOfDay = "End of work week";
		break;

		case "Saturday":
		case "Sunday":
		typeOfDay = "Weekend";
		break;
	default:
		System.out.println("Invalid day of the week: " +
		dayOfWeekArg);
		}
	System.out.println(typeOfDay);
	}
}

/**
* penjelasan Program tentang mencoba seleksi switch-case.
	pertama output akan menampilkan 'Start of work week' apabila dayOfWeekArg= monday,
	kedua output akan menampilkan 'Midweek' apabila dayOfWeekArg= Tuesday atau Wednesday atau Friday,
	ketiga output akan menampilkan 'end of work week' apabila dayOfWeekArg= friday,
		namun apbila  dayOfWeekArg tidak ada dari pilhan diatas, maka akan dijalan pernyataan default.
jadi hasil program diatas adalah 'Midweek', hal ini dikarenakan dayOfWeekArg= thursday.
*/
