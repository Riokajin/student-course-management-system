import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person {
    private String name;
    private String id;
    private String email;

    public Person(String name, String id, String email) {
        setName(name);
        setId(id);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().equals("") || name.trim().equals(null)) {
            System.out.println("Error Setting Name: Name must have a value.");
        } else {
            this.name = name;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.trim().equals("") || id.trim().equals(null)) {
            System.out.println("Error Setting ID: ID must have a value.");
        } else {
            int numberId;
            boolean isValid = false;
            Pattern idPattern = Pattern.compile("\\d+");
            Matcher matcher = idPattern.matcher(id);
            while (matcher.find()) {
                isValid = true;
            }
            if (isValid) {
                try {
                    numberId = Integer.parseInt(id);
                    System.out.println("Number String found for ID, Formatting:");
                    String validID = "S-" + numberId;
                    this.id = validID;

                } catch (NumberFormatException e) {
                    System.out.println("Error Setting ID: Input is not a number");
                }
            }
            else {
                System.out.println("Error Setting ID: No number found.");
            }
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.trim().equals("") || email.trim().equals(null)) {
            System.out.println("Error Setting Email: Email must have a value.");
        } else {
            if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9+.-]+$")) {
                this.email = email;
            } else {
                System.out.println("Error Setting Email: Email is improperly formatted. Format is: '___@___.___");
            }
        }
    }

    public abstract String getDetails();
}