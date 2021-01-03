/**
 * Write a description of class DVD here.
 *
 * @author (Raihan Amal Ramadhan)
 * @menjalankan kode di pertemuan5
 */
public class DVD extends Item{
	private String director;
	
	public DVD(String theTitle, int time, String director){
		super(theTitle, time);
		this.director = director;
	} 

	public String getDirector()
	{
		return director;
	}
}

/**
Class ini merupakan turunan dari class Item
*/