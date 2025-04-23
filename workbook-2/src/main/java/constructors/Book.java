package constructors;
public class Book {
     String title;
     String author;
     int page;

     public Book(String title, String author, int page){
         this.title = title;
         this.author = author;
         this.page = page;
     }
     public Book(){
         this.title = "untitled";
         this.author = "unknown";
         this.page = 0;

     }
    public void book(String title, String author, int page) {
        System.out.println("This book is " + title + " by " + author + " it has " + page + " pages");
    }

    public void book(){
        System.out.println("This book is " + title + " by " + author + " it has " + page + " pages");
    }
}