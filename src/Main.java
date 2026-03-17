
import java.util.ArrayList;
import java.util.Scanner;


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

    ArrayList<String> students = new ArrayList<>();
   

    System.out.println("what would you like to do?:");
    System.out.println("a) add");
    System.out.println("b) remove(by ID)");
    System.out.println("c) display");
    System.out.println("d) search(by ID or Name)");
    System.out.println("e) exit");

    Scanner scanner = new Scanner(System.in);

    String userInput = scanner.nextLine().toLowerCase();

    if (userInput == "a" || userInput == "add") {
      //add
       students.add(p1.getDetails());
    }
    else if (userInput == "b" || userInput == "remove"){
      //remove
    }
    else if (userInput == "c" || userInput == "display"){
      //display
      System.out.println(students);
    }
    else if (userInput == "d" || userInput == "search"){
      //search

    }
    else if (userInput == "e" || userInput == "exit"){
       //exit

    }
    else{
        System.out.println("please try a new input");
    }

  }
}