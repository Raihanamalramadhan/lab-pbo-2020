/**
 * Write a description of class Item here.
 *
 * @author (Raihan Amal Ramadhan)
 * @menjalankan kode di pertemuan5
 */
public class Item{
	private String title;
	private int playingTime;
	private String gotIt;
	private String comment;


	public Item(String title, int time){
		this.title = title;
		this.playingTime = time;
	}

	public void setComment(String comment){
		this.comment = comment;
	}

	public String getComment(){
		return comment;
	}

	public void setOwn(String gotIt){
		this.gotIt = gotIt;
	}

	public void print(){

	}
}

/**
Class ini merupakan parent class dari class CD dan DVD
*/