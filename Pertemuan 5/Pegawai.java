/**
 * Write a description of class Pegawai here.
 *
 * @author (Raihan Amal Ramadhan)
 * @menjalankan kode di pertemuan5
 */
public class Pegawai {
 private String nama; 
 private double gaji;
  
 public Pegawai(String nama, double gaji)
 {
  this.nama = nama;
  this.gaji = gaji; 
 }
 
 public void setNama(String nama) 
 {
  this.nama = nama;
 }
  
 public String getNama() 
 { 
  return this.nama;
 }
 
 public void setGaji(double gaji)
 {
  this.gaji = gaji; 
 }
  
 public double getGaji()
 { 
  return this.gaji;
 } 

}

/**
merupakan class parent dari class Manager
*/