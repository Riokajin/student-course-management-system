
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes;


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
    
    
    //add
    if (userInput.equalsIgnoreCase("a") || (userInput.equalsIgnoreCase("add"))){ 
      students.add(p1.getDetails());
      System.out.println("whats the student name");
      String userName = scanner.nextLine();
            System.out.println("whats the student name");
      String userName = scanner.nextLine();
    }

    //remove
    else if (userInput.equalsIgnoreCase("b") || (userInput.equalsIgnoreCase("remove"))){
      
      System.out.println("please input ID of student you would like to remove");
      
      String userRemove = scanner.nextLine();

      for (int i = 0; i < students.size(); i++) {
         
        if(userRemove.equalsIgnoreCase(students.get(i))){

          students.remove(i);
        }
        
      }

    }

    //display
    else if (userInput.equalsIgnoreCase("c") || (userInput.equalsIgnoreCase("display"))){

      System.out.println(students);
    }

    //search
    else if (userInput.equalsIgnoreCase("d") || (userInput.equalsIgnoreCase("search"))){
      
      System.out.println("please input name or ID of student you would like to search for");
      String userSearch = scanner.nextLine().toLowerCase();
      //checks if the search finds name or id
      
      for (int i = 0; i < students.size(); i++) {
         
        if(userSearch.equalsIgnoreCase(students.get(i))){

          System.out.println(students.get(i));
        } 
      }
    }

    //exit
    else if (userInput.equalsIgnoreCase("e") || (userInput.equalsIgnoreCase("exit"))){

      System.exit(0);

    }

    else{
      System.out.println("please input proper option");
    }
  }
}