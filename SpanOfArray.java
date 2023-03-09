package ArrayHomeWork;

import java.util.Scanner;

public class SpanOfArray {
          // Span of array=Max Element-Min Element of array
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int arr[]={1,2,3,4,5};
                    // int arr[]={10,10,10,10,10};
                    // int arr[]={10,10,5};
                    // int arr[]={10};
                    int n=arr.length;
                    int max=-1,min=1010000000;
                    for(int i=0;i<n;i++){
                              if(max<arr[i]){
                                        max=arr[i];
                              }if(min>arr[i]){
                                        min=arr[i];
                              }
                    }
                    System.out.println("Span Of Arrays= "+(max-min));
                    sc.close();
          }
}
