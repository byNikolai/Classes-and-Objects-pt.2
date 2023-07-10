public class Main {

    public static void main(String[] args) {
        Author liuCixin = new Author("liu", "Cixin");
        Author romanProkofiev = new Author("Роман", "Прокофьев");
        Author romanProkofiev2 = new Author("Роман", "Прокофьев");

        //equals for Author realisation
        System.out.println(romanProkofiev.equals(romanProkofiev2)); // nothing changed

        Book liuBook = new Book(liuCixin, "China press", "The Three-body problem", 2008);
        Book romanBook = new Book(romanProkofiev, "1C publishing", "Te Cat`s game", 2017);
        Book romanBook2 = new Book(romanProkofiev, "1C publishing", "Te Dogs`s game", 2017);

        //equals for Book realisation
        System.out.println(romanBook.equals(romanBook2));    // bookName changed

        //toString realisation
        System.out.println(liuBook.toString());
        System.out.println(romanBook.toString());
        romanBook.setPublishingYear(2018);
        System.out.println(romanBook.toString());
    }
}