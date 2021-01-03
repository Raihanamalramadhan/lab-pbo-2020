/**
 * Write a description of class Menejer here.
 *
 * @author (Raihan Amal Ramadhan)
 * @menjalankan kode di pertemuan5
 */
public class Menajer extends Pegawai { 
 private String departemen;
 
 public Menajer(String nama, double gaji, String departemen) 
 {
  super(nama, gaji);
  this.departemen = departemen;
 } 
 
 public void setDepartemen(String departemen)
 {
  this.departemen = departemen; 
 }
 
 public String getDepartemen() 
 {
  return this.departemen;
 }
} 

/**
merupakan turun dari class pegawai
*/