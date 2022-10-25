public class Book {
    private int year�fPublication;
    private String nameBook;
    private Author author;

    public Book(int yearOfPublication, String nameBook, Author author){
        this.year�fPublication = year�fPublication;
        this.nameBook = nameBook;
        this.author = author;
    }

    public Author getAuthor(){
        return author;
    }
    public String getNameBook(){
        return nameBook;
    }
    public int getYear�fPublication(){
        return year�fPublication;
    }

    public void setYear�fPublication(int year�fPublication){
        this.year�fPublication = year�fPublication;
    }
}
