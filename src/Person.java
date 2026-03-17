// Base class for anything in the system that has a name, ID, and email.
// Student and Instructor both extend this, so this keeps the shared stuff in one place
public abstract class Person {
    private String name;
    private String id;
    private String email;

    // Basic constructor that sets the common fields.
    // Validation gets handled later in the project, so this just assigns the values.
    public Person(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name; // This will be updated by validation
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id; // This will be updated by validation
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email; // This will be updated by validation
    }
    // Forces subclasses to provide their own "details" output.
    // Each type of Person formats their info differently.
    public abstract String getDetails();
}
