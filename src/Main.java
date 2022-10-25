public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Константин", 2022);
        Book book2 = new Book("Максим", 2020);
        Author author1 = new Author("Константин", "Чинаски");
        Author author2 = new Author("Максим", "Игнатьев");
        book1.setYearОfPublication(2019);
        System.out.println(book1.getYearОfPublication());
    }
}