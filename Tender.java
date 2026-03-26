import java.util.Scanner;

public class Tender {
  float cost;
  String companyName;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Tender[] obj = new Tender[5];

    for(int i = 0; i < 5; i++){
      obj[i] = new Tender();

      System.out.println("Enter cost: ");
      obj[i].cost = sc.nextFloat();
      sc.nextLine();

      System.out.println("Enter Company Name: ");
      obj[i].companyName = sc.nextLine();
    }

    float min = obj[0].cost;
    String minCompany = obj[0].companyName;

    for(int j = 0; j < 5; j++){
      System.out.printf("Company name number %d: %s\n", j + 1, obj[j].companyName);
      System.out.printf("Company cost number %d: %.2f\n", j + 1, obj[j].cost);

      if(obj[j].cost < min){
        min = obj[j].cost;
        minCompany = obj[j].companyName;
      }
    }

    System.out.println("\nMinimum Tender:");
    System.out.println("Company: " + minCompany);
    System.out.println("Cost: " + min);
  }
}