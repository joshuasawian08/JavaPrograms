public class Alt {
  public void altElement(int[] arr){
    for(int i = 0; i < arr.length; i = i + 2){
      System.err.println(arr[i]);
    }
  }

  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Alt a = new Alt();
    a.altElement(arr);
  }
}
