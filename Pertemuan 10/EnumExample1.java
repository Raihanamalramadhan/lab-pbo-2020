/**
 * Write a description of class EnumExample1 here.
 *
 * @author (Raihan Amal Ramadhan)
 * @Mengerjakan Modul 10
 */
class EnumExample1
{
    public enum Season { WINTER, SPRING, SUMMER, FALL}
    public static void main(String[] args) 
    {
        for (Season s : Season.values())
            System.out.println(s); 
    }
}  

/**
 Output :
   WINTER
   SPRING
   SUMMER
   FALL
    
   jadi pada variabel season bertipe enum yang telah diisi dapat dicetak dengan for each. 
   yaitu menggunakan method .values()
*/