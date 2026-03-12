public class Main {
  public static void main(String[] args) {
    // Polymophism demonstration
    Person p1 = new Student(
      "Alice Johnson", 
      "S-1234", 
      "alice@example.com", 
      "Computer Science", 
      1
    );

    Person p2 = new Instructor(
      "Dr. Smith",
      "I-5678",
      "smith@example.com",
      "Mathematics"
    );

    // Print details (method overriding)
    System.out.println(p1.getDetails());
    System.out.println("-------------");
    System.out.println(p2.getDetails());
  }
}