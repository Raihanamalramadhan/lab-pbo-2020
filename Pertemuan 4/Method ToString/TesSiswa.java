/**
 * Write a description of class TesSiswa here.
 * materi ToString
 * @author (Raihan Amal Ramadhan)
 * @pembahasan kode lab
 */
public class TesSiswa
{
    public static void main(String[] ar)
    {
        Siswa s = new Siswa();
        Siswa ss = new Siswa(8030001, "Upin");
        
        //ini akan menimbulkan error
        //Siswa sss = new Siswa(8030002);  

        System.out.println(s);
        System.out.println(ss);
    }
}