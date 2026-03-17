/* 
  Cameron Reflection: I did most of the error detection and prevention in the program,
  and I learned of more situations where a try catch block is useful, such as when trying
  to perform an action on something that might be null. This assignment also was going for
  learning to work off my peers code.
*/

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