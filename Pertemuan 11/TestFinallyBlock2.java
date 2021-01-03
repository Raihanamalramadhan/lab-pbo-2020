/**
 * Write a description of class TestFinallyBlock2 here.
 *
 * @author (Raihan Amal Ramadhan)
 * @Mengerjakan latihan modul 11
 */
public class TestFinallyBlock2
{  
  public static void main(String args[])
  {  
        try
        {  
            int data=25/0;  
            System.out.println(data);  
        }  
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }  
        finally
        {
            System.out.println("finally block is always executed");
        }  
        System.out.println("rest of the code...");  
  }   
}   

/**
  Outputnya berupa :
  java.lang.ArithmeticException: / by zero
  finally block is always executed
  rest of the code...
*/