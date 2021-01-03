/**
 * Write a description of class EnumExample5 here.
 *
 * @author (Raihan Amal Ramadhan)
 * @Mengerjakan Modul 10
 */
class EnumExample5
{
    enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY}
    public static void main(String args[])
    {
        Day day=Day.MONDAY;
        switch(day)
        {
            case SUNDAY: System.out.println("sunday");
            break;
            case MONDAY: System.out.println("monday");
            break;
            default: 
            System.out.println("other day");
        }
    }
} 

/**
 enum dapat diterapkan konsep switch case seperti yang dilihat dalam kasus ini.
 parameter dalam switchnya berupa "MONDAY" sehingga hasil outputnya adalah monday

  makanya Output yaitu:
    monday
*/    