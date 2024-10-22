public class Book {
    final private String title;
    final private Author author;
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

    @Override
    public String toString() {
        return title + " Автора: " + author + ", " + yearOfPublication + " года.";
    }


    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Book book = (Book) obj;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title);
    }
}