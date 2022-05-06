//minimum of the array
class t{
  public static void main(String[] args) {
    int arr[]={23,43,22,21,34};
    int min=arr[0];
    for (int i=0;i<arr.length ;i++ ) {
      if (min>arr[i]) {
        min=arr[i];
      }
    }System.out.println(min);
  }
}