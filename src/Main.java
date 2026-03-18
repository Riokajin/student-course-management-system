/* 
  Cameron Reflection: I did most of the error detection and prevention in the program,
  and I learned of more situations where a try catch block is useful, such as when trying
  to perform an action on something that might be null. This assignment also was going for
  learning to work off my peers code.
*/
/* 
  Adam Reflection: I worked mainly on the OOP structure for this project, 
  making sure the classes were set up properly and fit together the way the assignment expected. 
  I also spent time dealing with GitHub merges and conflicts, 
  which helped me understand how group projects can get messy if things aren’t kept organized. 
  Overall, I learned more about building a program using inheritance and how to manage shared code with a team.
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


    // Print details (method overriding)
    System.out.println(p1.getDetails());
    System.out.println("-------------");

    ArrayList<Student> students = new ArrayList<>();
    
    //sets exit to false for the while loop to fucntion up until the exit is set to true
    boolean exit = false;

    //adds student as test
    students.add((Student)p1);


   while(exit == false){
    //menu for the user
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
        //prompts the user to input info for the new student
        System.out.println("whats the student name");
        String userName = scanner.nextLine();
        
        System.out.println("enter student ID");
        String userId = scanner.nextLine();
        
        System.out.println("email");
        String userEmail = scanner.nextLine();

        System.out.println("program ");
        String userProgram = scanner.nextLine();
        
        System.out.println("year");

        int userYear = Integer.parseInt(scanner.nextLine());
        
        //contains all new info in and new student
        Person p = new Student(
          userName, 
          userId, 
          userEmail, 
          userProgram, 
          userYear);
        
        //adds new student
        students.add((Student)p);

        System.out.println("new student added");
        continue;
      }

      //removes the student if the correct id is input
      else if (userInput.equalsIgnoreCase("b") || (userInput.equalsIgnoreCase("remove"))){
        
        System.out.println("please input ID of student you would like to remove");
        
        String userRemove = scanner.nextLine();

        //iterates through the array
        for (int i = 0; i < students.size(); i++) {
          
          if(userRemove.equalsIgnoreCase(students.get(i).getId())){

          students.remove(i);
          } 
        }
        continue;
      }

      //displays students in student array
      else if (userInput.equalsIgnoreCase("c") || (userInput.equalsIgnoreCase("display"))){
        
        for (int i = 0; i < students.size(); i++) {
          
          System.out.println(students.get(i).getDetails());

        } 
        continue;

        }
        
    
      //search
      else if (userInput.equalsIgnoreCase("d") || (userInput.equalsIgnoreCase("search"))){
        
        System.out.println("please input name or ID of student you would like to search for");
        String userSearch = scanner.nextLine().toLowerCase();
        //checks if the search finds name or id by iterating through the array
        for (int i = 0; i < students.size(); i++) {
          
          if(userSearch.equalsIgnoreCase(students.get(i).getId()) || userSearch.equalsIgnoreCase(students.get(i).getName())){

            System.out.println(students.get(i).getDetails());
          } 
        }
        continue;
      }

      //exits out of the while loop
      else if (userInput.equalsIgnoreCase("e") || (userInput.equalsIgnoreCase("exit"))){
        System.out.println("bye bye");
        exit = true;
        System.exit(0);

      }

      //else for incase the input is wrong
      else{
        System.out.println("please input proper option");
        continue;
      }
    }
  }
}
