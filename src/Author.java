public class Author {
    final private String firstName;
    final private String middleName;

    public Author(String firstName, String middleName) {
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        return firstName + " " + middleName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Author author = (Author) obj;
        return firstName.equals(author.firstName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName);
    }
}