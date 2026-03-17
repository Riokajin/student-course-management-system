public class Instructor extends Person {
    private String department;

    public Instructor(String name, String id, String email, String department) {
        super(name, id, email);
        setDepartment(department);
    }

    public void setDepartment(String department) {
        if(department.trim() == null || department.trim().equals("")) {
            System.out.println("Error setting Department: Department cannot be empty.");
        }
        else {
            this.department = department;
        }
    }

    @Override
    public String getDetails() {
        return "Instructor: " + getName() +
               "\nID: " + getId() +
               "\nEmail: " + getEmail() +
               "\nDepartment: " + department;
    }
}