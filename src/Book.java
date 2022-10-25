public class Book {
    private int yearÎfPublication;
    private String nameBook;
    private Author author;

    public Book(int yearOfPublication, String nameBook, Author author){
        this.yearÎfPublication = yearÎfPublication;
        this.nameBook = nameBook;
        this.author = author;
    }

    public Author getAuthor(){
        return author;
    }
    public String getNameBook(){
        return nameBook;
    }
    public int getYearÎfPublication(){
        return yearÎfPublication;
    }

    public void setYearÎfPublication(int yearÎfPublication){
        this.yearÎfPublication = yearÎfPublication;
    }
}
