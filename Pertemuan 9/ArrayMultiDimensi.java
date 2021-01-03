/**
 * Write a description of class ArrayMultiDimensi here.
 *
 * @author (Raihan Amal Ramadhan)
 * @Membahas modul pratikum 9
 */
public class ArrayMultiDimensi {

    public static void main(String[] args) {

        String[][] provinsi = new String[3][2];
        provinsi[0][0] = "Aceh";
        provinsi[0][1] = "Banda Aceh";
        provinsi[1][0] = "Maluku Utara";
        provinsi[1][1] = "Sofifi";
        provinsi[2][0] = "Papua Barat";
        provinsi[2][1] = "Manokwari";

        for (int i = 0; i < provinsi.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ibukota ")
                    .append(provinsi[i][0])
                    .append(" adalah ")
                    .append(provinsi[i][1])
                    .append(".");
            System.out.println(sb);
        }
    }
} 

/**
  output yang dihasikan sesuai dengan String yang ditambahkan 
    dengan menggunakan method.append dari StringBuilder

    Outputnya yang tampil:
    Ibukota Aceh adalah Banda Aceh.
    Ibukota Maluku Utara adalah Sofifi.
    Ibukota Papua Barat adalah Manokwari.
*/    
