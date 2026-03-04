public class conOverload {
  String x;
  conOverload(String x){
   System.out.println(x);
  }

  conOverload(){
    System.out.println("Default Constructor!");
  }

  public static void main(String[] args){
    conOverload c = new conOverload("Parameterized constructor!");
    conOverload C = new conOverload();
  }
}
