import java.util.Objects;

public class Book {
    private int yearOfPublication;
    private String nameBook;
    private Author author;

    public Book(int yearOfPublication, String nameBook, Author author){
        this.yearOfPublication = yearOfPublication;
        this.nameBook = nameBook;
        this.author = author;
    }

    public Author getAuthor(){
        return author;
    }
    public String getNameBook(){
        return nameBook;
    }
    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }

    public String toString(){
        return "Название книги: " + nameBook;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Book book = (Book) o;
        return nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode(){
        int result = nameBook == null ? 0 : nameBook.hashCode();
        result = result + yearOfPublication;
        return Objects.hash(yearOfPublication, nameBook, author);
    }
}
