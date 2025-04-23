package encapsulation;

 class Book {
    private String author;
    private String name;
    private int page;
    private boolean isFiction;

     public boolean isFiction() {
         return isFiction;
     }

     public void setFiction(boolean fiction) {
         if (fiction == true){
             System.out.println("Ah, a fictional tale!");
         }else {
             System.out.println("Real-life drama, huh?");
         }
         isFiction = fiction;
     }

     public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if (page > 0) {
            this.page = page;
        } else {
            System.out.println("page has to be at least 1 (setting it to default)");
        }
    }

    public void read(){
        System.out.println("The pages has " + page + " pages");
    }
}
public class exercise {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setAuthor("john");
        book1.setName("Learning java");
        book1.setPage(-1);

        System.out.println(book1.getAuthor());
        book1.setPage(44);
        book1.read();

        book1.setFiction(true);
        book1.setFiction(false);
    }
}
