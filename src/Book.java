public class Book {
    private int yearŒfPublication;
    private String nameBook;
    private Author author;

    public Book(int yearOfPublication, String nameBook, Author author){
        this.yearŒfPublication = yearŒfPublication;
        this.nameBook = nameBook;
        this.author = author;
    }

    public Author getAuthor(){
        return author;
    }
    public String getNameBook(){
        return nameBook;
    }
    public int getYearŒfPublication(){
        return yearŒfPublication;
    }

    public void setYearŒfPublication(int yearŒfPublication){
        this.yearŒfPublication = yearŒfPublication;
    }

    public String toString(){
        return "Õ‡Á‚‡ÌËÂ ÍÌË„Ë: " + nameBook;
    }

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

    public int hashCode(){
        int result = nameBook == null ? 0 : nameBook.hashCode();
        result = result + yearŒfPublication;
        return result;
    }
}
