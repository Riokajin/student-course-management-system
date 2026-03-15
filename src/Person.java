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
        }
        else {
            this.name = name; // This will be updated by validation
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.trim().equals("") || id.trim().equals(null)) {
            System.out.println("Error Setting ID: ID must have a value.");
        }
        else {
            if(id.matches("^S-\\d{4}$")) {
                this.id = id;  // This will be updated by validation
            }
            else {
                System.out.println("Error Setting ID: ID is improperly formatted. Format is: 'S-####'");
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.trim().equals("") || email.trim().equals(null)) {
            System.out.println("Error Setting Email: Email must have a value.");
        }
        else {
            if(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9+.-]+$")) {
                this.email = email; // This will be updated by validation
            }
            else {
                System.out.println("Error Setting Email: Email is improperly formatted. Format is: '___@___.___");
            }
        }
    }

    public abstract String getDetails();
}