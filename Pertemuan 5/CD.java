/**
 * Write a description of class Cd here.
 *
 * @author (Raihan Amal Ramadhan)
 * @menjalankan kode di pertemuan5
 */
public class CD extends Item{
	private String artist;
	private int numberOfTracks;

	public CD(String theTitle, String theArtist, int tracks, int time){
		super(theTitle, time);
		artist = theArtist;
		numberOfTracks = tracks;
	}

	public String getArtist(){
		return this.artist;
	}

	public int getNumberOfTracks(){
		return this.numberOfTracks;
	}
}

/**
 class ini merupakan turunan dari class item
*/