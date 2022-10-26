import java.util.Arrays;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Author author1 = new Author("Konstantin Chinaski");
        Author author2 = new Author("Makism Ignatiev");
        Book book1 = new Book(2000,"Moon", author1);
        Book book2 = new Book(2020,"JavaProgramming", author2);
        book2.setYearÎfPublication(2022);
    }
}