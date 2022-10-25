public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Konstantin", 2022);
        Book book2 = new Book("Maksim", 2020);
        Author author1 = new Author("Konstantin", "Chinaski");
        Author author2 = new Author("Maksim", "Ignatiev");
        book1.setYearÎfPublication(2018);
        System.out.println(book1.getYearÎfPublication());
    }
}