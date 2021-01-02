
/**
 * Write a description of class Book here.
 *
 * @author (Raihan Amal Ramadhan)
 * @version (a version number or a date)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
        refNumber = " ";
    }
    
    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }
    
    public String printAuthor(){
        return author;
    }
    
    public String printTitle(){
        return title;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public void printDetails(){
        System.out.println("nama penulis = "+getAuthor());
        System.out.println("judul = "+getTitle());
        System.out.println("jumlah lembar = "+getPages());
        System.out.println("ref Number = "+ getRefNumber());
    }
    
    public void setRefNumber(String ref){
        refNumber = ref;
    }
    
    public String getRefNumber(){
        return refNumber;
    }
}