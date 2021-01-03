/**
 * Write a description of class Testtrycatch2 here.
 *
 * @author (Raihan Amal Ramadhan)
 * @Mengerjakan latihan modul 11
 */
public class Testtrycatch2
{  
    public static void main(String args[])
    {  
        try
        {  
            int data=10/0;  
        }catch(ArithmeticException e){
            System.out.println(e);
        }  
   
        System.out.println("rest of the code...");  
    }  
}  

/**
  Outputnya:
  java.lang.ArithmeticException: / by zero
  rest of the code...
  Maksudnya yaitu:
      eror pada kode program sudah dihandle dengan menerapkan konsep exception handling
  sehingga saat di run seharusnya menghasilkan eror, namun karena sudah dihandle akan diprint erornya 
  namun program tetap berjalan hingga selesai
*/
   