/**
 * Write a description of class TestMultipleCatchBlock here.
 *
 * @author (Raihan Amal Ramadhan)
 * @Mengerjakan latihan modul 11
 */
public class TestMultipleCatchBlock
{  
   public static void main(String args[])
   {  
     try{ 
      int a[]=new int[5];  
      a[5]=30/0;  
    }  
     catch(ArithmeticException e)
     {  
         System.out.println("task1 is completed");
     }  
     catch(ArrayIndexOutOfBoundsException e)
     {
         System.out.println("task 2 completed");
     }  
     catch(Exception e)
     {
         System.out.println("common task completed");
     }  
  
     System.out.println("rest of the code...");  
   }   
}   
 
/**
Output :
task1 is completed
rest of the code...
artinya 

jadi program di atas mengandung arithmaticexception, program tetap
berjalan hingga selesai karena eror sudah dihandle oleh exception handling
*/     