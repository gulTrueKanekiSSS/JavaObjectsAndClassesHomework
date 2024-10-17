public class Author {
    private String firstName;
    private String middleName;

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
}