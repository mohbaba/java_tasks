import java.util.Scanner;
public class Question{
 public static void main(String []args){
  Scanner input = new Scanner(System.in);
  System.out.println("Hello! What is your name?");
  String name = input.nextLine ();
  System.out.println("How old are you?");
  int age = input.nextInt ();

System.out.printf("Your name is %s%n", name);
System.out.printf("Your age is %d%n", age);

}
}


 