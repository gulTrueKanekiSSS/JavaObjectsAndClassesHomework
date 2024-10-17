public class Book {
    private String title;
    private Author author;
    int yearOfPublication;

    public Book(String title, Author author, int yearOfProduct) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfProduct;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}