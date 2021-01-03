/**
 * Write a description of class CobaMakhlukHidup here.
 *
 * @author (Raihan Amal Ramadhan)
 * @Mengerjakan Latihan modul 8
 */
public class CobaMakhlukHidup
{
    
    /**
     * Method main untuk mencoba kelas makhluk hidup, Manusia dan Hewan
     * 
     * 
     */
    public static void main (String args[])
    {
        Manusia mnsia = new Manusia();
        Hewan hwan = new Hewan();
        
        mnsia.bernapas();
        mnsia.makan();
        mnsia.berjalan();
        
        hwan.bernapas();
        hwan.makan();
        hwan.berjalan();

        
        //MakhlukHidup mh = new MakhlukHidup(); ==> akan dihasilkan eror karen abstract class tidak bisa dibuat menjadi sebuah objek

    }
}