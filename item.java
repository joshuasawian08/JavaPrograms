import java.util.Scanner;

public class item {
  String code;
  float price;
  public static void main(String[] args){
    float total = 0;
    Scanner sc = new Scanner(System.in);
    item[] obj = new item[5];
    for(int i = 0; i < 5; i++){
      obj[i] = new item();
    }

    for(int j = 0; j < 5; j++){
      System.out.printf("Give item code for item number %d: \n", j + 1);
      obj[j].code = sc.nextLine();
      System.out.printf("Give item price for item number %d: \n", j + 1);
      obj[j].price = sc.nextFloat();
      sc.nextLine();
    }

    for(int x = 0; x < 5; x++){
      System.out.printf("Price of item number %d is %f: \n", x + 1, obj[x].price);
      System.out.println(" ");
      System.out.printf("Code of item number %d is %s: \n", x + 1, obj[x].code);
      System.out.println(" ");
      total += obj[x].price;
      System.out.println("Total price of all items is " + total);
    }
    sc.close();
  }
}
