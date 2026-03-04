public class ArrayMerge {
  public static void main(String[] args){

    int[] A = {1, 2, 3, 4, 5, 6};
    int[] B = {10, 11, 12, 13, 14, 15};
    int[] C = new int[A.length + B.length];

    int i = 0, j = 0, k = 0;

    while(i < A.length  && j < B.length){
      if(A[i] < B[j]){

        C[k] = A[i];
        i++;

      }else{
        C[k] = B[j];
        j++;
      }
      k++;
    }

    while(i < A.length){
      C[k] = A[i];
      i++;
      k++;
    }

    while(j < B.length){
      C[k] = B[j];
      k++;
      j++;
    }

    System.out.println("Merged Array:");

    for (int num : C) {
      System.out.print(num + " ");
    }
  }
}
