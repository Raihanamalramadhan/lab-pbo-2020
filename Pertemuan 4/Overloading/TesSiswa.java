/**
 * Write a description of class Siswa here.
 * materi Overloading
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

        System.out.println(s.getNrp() + "  " + s.getNama());
        System.out.println(ss.getNrp() + "  " + ss.getNama());
        
        System.out.println(s);
        System.out.println(ss);
    }
}

// output berupa : 12345  nama default, 8030001  Upin, Siswa1@51016012, Siswa1@29444d75
// jadi hak di atas terjadi karena objek yang diciptakan pada baris pertama dan kedua berhasil dicetak 
// namun pada baris selanjutnya dicetak alamat dari objeknya karena objek tidak bisa  diprint.