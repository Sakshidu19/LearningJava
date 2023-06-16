package ClassConcept;

public class Book {
    String title;
    int price;
    int no_of_pages;
    Author A1;

    Book()
    {
        A1=new Author();
    }
    public void readBook(){
        System.out.println("We can read a book");
    }
    public void writeBook(){
        System.out.println("We can write a book");
    }
    public void bookDetails()
    {
        System.out.println("Title of the book : " + title);
        System.out.println("Price of the book : " + price);
        System.out.println("No.of pages in the book : " + no_of_pages);
        A1.authorDetails();
    }
}
