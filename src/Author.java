import java.util.Objects;

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
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Author otherAuthor = (Author) obj;

        return Objects.equals(firstName, otherAuthor.firstName) &&
                Objects.equals(middleName, otherAuthor.middleName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName);
    }
}