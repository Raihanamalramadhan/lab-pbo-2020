
/**
 * Write a description of class Siswa here.
 *
 * @author (Raihan Amal Ramadan)
 * @version (a version number or a date)
 */
public class Siswa{
	private int nrp;
	private String nama;

	public Siswa(int nrpx, String namax){
		this.nrp = nrpx;
		this.nama = namax;
	}

	public void setNrp(int nrpx){
		this.nrp=nrpx;
	}

	public int getNrp(){
		return this.nrp;
	}

	public void SetNama(String namax){
		this.nama = namax;
	}

	public String getNama(){
		return this.nama;
	}
}