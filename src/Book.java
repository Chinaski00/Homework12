public class Book {
    private String authorsName;
    private int yearÎfPublication;

    public Book(String authorsName, int yearÎfPublication){
        this.authorsName = authorsName;
        this.yearÎfPublication = yearÎfPublication;
    }

    public String getAuthorsName(){
        return authorsName;
    }
    public int getYearÎfPublication(){
        return yearÎfPublication;
    }

    public void setYearÎfPublication(int yearÎfPublication){
        this.yearÎfPublication = yearÎfPublication;
    }
}
