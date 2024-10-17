//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Homework {

    public static void main(String[] args) {
        Author author = new Author("Джоан", "Роулинг");
        Book harryPotter = new Book("Harry Potter", author, 2000);

        Author author2 = new Author("Марк", "Твен");
        Book book = new Book("Том Сойер", author2, 2000);

        harryPotter.setYearOfPublication(2012);


    }

}
