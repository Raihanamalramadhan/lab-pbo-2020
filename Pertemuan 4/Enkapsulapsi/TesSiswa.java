
/**
 * Write a description of class tesSiswa here.
 *  Materi enkapsulasi
 * @author (Raihan Amal Ramadhan)
 * @pengerjaan latihan modul
 */
public class TesSiswa
{
    public static void main(String[] ar)
    {
        Siswa s = new Siswa(12345);

        s.nrp = 8030001;
        System.out.println(s.nrp);
        
        s.nrp = 8030002;
        System.out.println(s.nrp);
    }
}

/**
kode di atas akan menmenciptakan objek dari class Siswa dimana parameter yang dibutuhkan diinisialisasikan langsung
hasilcompail error karena nrp memiliki akses private
*/