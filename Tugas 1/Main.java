import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author Raihan amal ramadhan
 * @version 03 Desember 2020
 */
public class Main {
    public static void main(String[] args){ 
        int mode = 0;

        Bus bus = new Bus();
        Scanner input = new Scanner(System.in);

        menu();
        System.out.print("Pilih nomor: ");
        int pilih = input.nextInt();

        while (pilih != 4) {
            switch (pilih) {
                case 1:
                    while (mode != 2) {
                        System.out.print("Nama : ");
                        String nama = input.next();
                        System.out.print("Masukan Umur: ");
                        int umur = input.nextInt();
                        System.out.print("Hamil [y/n]: ");
                        Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("N") ? true : false;

                        Penumpang penumpang = new Penumpang(nama, umur, hamil);
                        bus.naikPenumpang(penumpang);
                        bus.toString();
                        System.out.println("");
                        System.out.print("Naikkan? (1.Yes 2.No) :");
                        mode = input.nextInt();
                        System.out.println("============================");
                    }
                    break;
                case 2:
                    System.out.print("\nMasukan nama yang ingin dihapus: ");
                    String nama = input.next();
                    bus.turunkanPenumpang(nama);
                    bus.toString();
                    System.out.println("============================");
                    System.out.println("");
                    break;
                case 3:
                    bus.toString();
                    System.out.println("============================");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }

            menu();
            System.out.print("Pilih nomor: ");
            pilih = input.nextInt();

        }
    }
    
    public static void menu(){
        System.out.println("===== BUS TRANS KOETARADJA =====");
        System.out.println("MENU");
        System.out.println("1. Naikkan Penumpang");
        System.out.println("2. Turunkan Penumpang");
        System.out.println("3. Lihat Penumpang");
    }
}