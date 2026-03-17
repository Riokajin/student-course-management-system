import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person {
    // Properties
    private String name;
    private String id;
    private String email;

    // Constructor
    public Person(String name, String id, String email) {
        setName(name);
        setId(id);
        setEmail(email);
    }

    // Method to get the persons name
    public String getName() {
        return name;
    }

    // Method to validate and set the name
    public void setName(String name) {
        // This only checks if the name is not null or empty, not for specific characters
        try {
            if (name.trim().equals("") || name.trim().equals(null)) {
                System.out.println("Error Setting Name: Name must have a value.");
            }
            else {
                this.name = name;
            }
        }
        catch (NullPointerException e) {
            System.out.println("Error Setting Name: Name must have a value.");
        }
        
    }

    // Method to get the id
    public String getId() {
        return id;
    }

    // Method to set the id
    public void setId(String id) {
        // Checks if the id is null or empty
        try {
            // Doesn't run the program if the id is empty
            if (id.trim().equals("") || id.trim().equals(null)) {
                System.out.println("Error Setting ID: ID must have a value.");
            }
            else {
                // Following code looks for a set of numbers in the inputed id, then formats the id as it's supposed to be and sets it
                int numberId;
                boolean isValid = false;
                String numbers = "";
                Pattern idPattern = Pattern.compile("\\d+");
                Matcher matcher = idPattern.matcher(id);
                while (matcher.find()) {
                    isValid = true;
                    numbers = matcher.group();
                }
                if (isValid) {
                    try {
                        numberId = Integer.parseInt(numbers);
                        System.out.println("Number String found for ID, Formatting:");
                        String validID = "S-" + numberId;
                        this.id = validID;

                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error Setting ID: Input is not a number");
                    }
                }
                else {
                    System.out.println("Error Setting ID: No number found.");
                }
            }
        }
        catch (NullPointerException e) {
            System.out.println("Error Setting ID: ID must have a value.");
        }
    }

    // Method to get the email
    public String getEmail() {
        return email;
    }

    // Method to set the email
    public void setEmail(String email) {
        try {
            if (email.trim().equals("") || email.trim().equals(null)) {
                System.out.println("Error Setting Email: Email must have a value.");
            }
            else {
                // Email has specific regex format, code ensures this before setting it
                if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9+.-]+$")) {
                    this.email = email;
                }
                else {
                    System.out.println("Error Setting Email: Email is improperly formatted. Format is: '___@___.___");
                }
            }
        }
        catch
        (NullPointerException e) {
            System.out.println("Error Setting Email: Email must have a value.");
        }
    }

    public abstract String getDetails();
}
