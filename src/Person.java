public abstract class Person {
    private String name;
    private String id;
    private String email;


    public Person(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

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

    public abstract String getDetails();
}