/**
 * Write a description of class MakhlukHidup here.
 *
 * @author (Raihan Amal Ramadhan)
 * @Mengerjakan Latihan modul 8
 */
public abstract class MakhlukHidup
{
    
    /**
     * Method kongkrit bernapas
     * 
     */
    public void bernapas()
    {
        System.out.println("Makhluk hidup bernapas...");
    }
    
    /**
     * Method kongkrit makan
     * 
     */
    public void makan()
    {
        System.out.println("Makhluk hidup makan...");
    }
    
    /**
     * Method abstract berjalan yg wajib di override oleh subkelas
     * 
     */
    public abstract void berjalan();
    
}