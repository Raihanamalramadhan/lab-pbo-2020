import java.util.*;
/**
 * Write a description of class Bus here.
 *
 * @author Raihan amal ramadhan
 * @version 03 Desember 2020
 */
public class Bus {
    Scanner tulis = new Scanner(System.in);

    private ArrayList <Penumpang> penumpangBiasa;
    private ArrayList <Penumpang> penumpangPrioritas; 

    public Bus() {
        penumpangBiasa = new ArrayList<Penumpang>();
        penumpangPrioritas = new ArrayList<Penumpang>();
    }

    public ArrayList<Penumpang> getPenumpangBiasa(){
        for (Penumpang penumpang : penumpangBiasa) {
            penumpang.getNama();
        }
        return penumpangBiasa;

    }

    public ArrayList<Penumpang> getPenumpangPrioritas(){
        for (Penumpang penumpang : penumpangPrioritas) {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }

    public int getJumlahPenumpangBiasa(){
        System.out.println("Jumlah penumpang Biasa : " + penumpangBiasa.size());
        return penumpangBiasa.size();

    }

    public int getJumlahPenumpangPrioritas(){
        System.out.println("Jumlah penumpang Prioritas : " + penumpangPrioritas.size());
        return penumpangPrioritas.size();
    }

    public boolean naikPenumpang(Penumpang passenger){
        if ((penumpangPrioritas.size() < 2) && (passenger.getUmur() < 10 || passenger.getUmur() > 60) || (passenger.getHamil() == true)){
            System.out.println("Penumpang Dengan Nama " + passenger.getNama() + " Berhasil Ditambahkan");
            return penumpangPrioritas.add(passenger);
        } else if (penumpangBiasa.size() < 5){
            System.out.println("Penumpang Dengan Nama " + passenger.getNama() + " Gagal Ditambahkan");
            return penumpangBiasa.add(passenger);
        } else {
            System.out.println("Penumpang Dengan Nama " + passenger.getNama() + "Gagal Ditambahkan Dikarenakan Kursi Tidak Tersedia");
            return false;
        }
    }

    public boolean turunkanPenumpang(String nama){
        for (int i = 0; i < penumpangBiasa.size(); i++) {
            if (nama.equals(penumpangBiasa.get(i).getNama())) {
                penumpangBiasa.remove(i);
                System.out.println("Penumpang Berhasil Diturunkan");
                return penumpangBiasa.equals(nama);
            } else {
                System.out.println("Tidak Ada Penumpang Yang Bernama " + nama);
                return false;
            }
        }

        for (int i = 0; i < penumpangPrioritas.size(); i++) {
            if (nama.equals(penumpangPrioritas.get(i).getNama())) {
                penumpangPrioritas.remove(i);
                System.out.println("Penumpang Berhasil Diturunkan");
                return penumpangPrioritas.equals(nama);
            } else {
                System.out.println("Tidak Ada Penumpang Yang Bernama " + nama);
                return false;
            }
        }
        return penumpangPrioritas.equals(nama);
    }

    public String toString(){
        String namaPenumpangBiasa =" ", namaPenumpangPrioritas =" ";
        boolean test1 = penumpangBiasa.isEmpty();
        boolean test2 = penumpangPrioritas.isEmpty();

        for (Penumpang penumpang : penumpangBiasa) {
            namaPenumpangBiasa += penumpang.getNama().toString();
        }
        for (Penumpang penumpang : penumpangPrioritas) {
            namaPenumpangPrioritas += penumpang.getNama().toString();
        }

        if (test1 == true) {
            System.out.println("Penumpang Biasa");
        } else {
            System.out.println("daftar Nama Penumpang Biasa = " + namaPenumpangBiasa);
        }

        if (test2 == true) {
            System.out.println("Penumpang Prioritas");
        } else {
            System.out.println("daftar Nama Penumpang Prioritas = " + namaPenumpangPrioritas);
        }

        System.out.println("jumlah Semua Penumpang Adalah = " +penumpangBiasa.size() + penumpangPrioritas.size());

        return "daftar nama penumpang biasa = " + namaPenumpangBiasa + "daftar nama penumpang prioritas = " + namaPenumpangPrioritas
        + "jumlah1 semua penumpang = " + penumpangBiasa.size() + penumpangPrioritas.size();
    }
        
}