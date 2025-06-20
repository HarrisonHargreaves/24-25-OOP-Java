package code.week5_6;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private String copyrightDate;

   public Book(String title, String author,String publisher,String copyrightDate) {
       this.title = title;
       this.author = author;
       this.publisher = publisher;
       this.copyrightDate = copyrightDate;
   }

   public String getTitle() {
       return title;
   }
   public void setTitle(String title) {
       this.title = title;
   }

   public String getAuthor() {
       return author;
   }
   public void setAuthor(String author) {
       this.author = author;
   }

   public String getPublisher() {
       return publisher;
   }
   public void setPublisher(String publisher) {
       this.publisher = publisher;
   }

   public String getCopyrightDate() {
       return copyrightDate;
   }
   public void setCopyrightDate(String copyrightDate) {
       this.copyrightDate = copyrightDate;
   }

   public String toString(){
       return "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "Publisher: " + publisher + "\n" +
               "Copyright Date: " + copyrightDate + "\n";
   }
}
