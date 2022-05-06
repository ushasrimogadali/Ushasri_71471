import java.util.*;

class ass3{
public static void main(String args[]){
int[] arr={100, 250, 150, 350, 490, 560, 440};
System.out.println("Elements of original array: ");    
for (int i = 0; i < arr.length; i++) {     
System.out.print(arr[i] + " ");    
}    


System.out.println();
Ascend as= new Ascend(arr);
as.sort(arr);

System.out.println();
Decend ds= new Decend(arr);
ds.sort(arr);

System.out.println();
Store st= new Store(arr);
st.store(arr);

} 
}


class Ascend{
int temp=0;
int[] ar;
Ascend(int[] arr){
ar=arr;

}
public void sort(int[] ar){
for (int i = 0; i < ar.length; i++) {     
            for (int j = i+1; j < ar.length; j++) {     
               if(ar[i] > ar[j]) {    
                   temp = ar[i];    
                   ar[i] = ar[j];    
                   ar[j] = temp;    
               }     
            }     
        } 
    System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < ar.length; i++) {     
            System.out.print(ar[i] + " ");    
        }              
}
}

class Decend{
int temp=0;
int[] ar;
Decend(int[] arr){
ar=arr;

}
public void sort(int[] ar){
for (int i = 0; i < ar.length; i++) {     
            for (int j = i+1; j < ar.length; j++) {     
               if(ar[i] < ar[j]) {    
                   temp = ar[i];    
                   ar[i] = ar[j];    
                   ar[j] = temp;    
               }     
            }     
        } 
    System.out.println("Elements of array sorted in decending order: ");    
        for (int i = 0; i < ar.length; i++) {     
            System.out.print(ar[i] + " ");    
        }      
          
}
}

class Store{
int[] ar;
Store(int[] arr){
ar=arr;
}

public void store(int[] ar){
System.out.println("Number greater than 200 are: ");
for(int i=0; i<ar.length; i++){
if(ar[i]>200)
	System.out.print(ar[i]+" ");
}
}

}