public class noArgCon {

  String name;
  int age;

  noArgCon(){

    name = "Joshua Sawian";
    age = 21;

  }
  void display(){
    System.out.println("Name : " + name);
    System.out.println(age + " years old");
  }

  public static void main(String[] args){
    noArgCon arg = new noArgCon();
    arg.display();
  }

}
