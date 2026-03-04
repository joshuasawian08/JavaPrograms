import java.util.Scanner;

class Frequency{

  public int countFrequency(int[] arr, int element){
    int total = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == element){
        total += 1;
      }
    }
    return total;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x;
    System.out.println("Enter an element you want to check: ");
    x = sc.nextInt();
    int[] Array = {1, 2, 3, 4, 1};
    Frequency f = new Frequency();
    int Total = f.countFrequency(Array, 1);
    System.out.printf("%d is found %d times in this array\n", x, Total);
    sc.close();
  }

}