import java.util.Scanner;
public class Parameterized {
  String x;
  Parameterized(String x){
    this.x = x;
    System.out.println("My name is " + x);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name;
    System.out.println("Enter your name: ");
    name = sc.nextLine();
    Parameterized p = new Parameterized(name);
    sc.close();
  }

}
