package ArrayHomeWork;

import java.util.Scanner;

public class LeaderElement {
          // if arr element has no max element in its right side = leader element
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    // int arr[]=new int[n];
                    int arr[]={5,3,8,9,7,4};
                    // for(int i=0;i<n;i++){
                    //           arr[i]=sc.nextInt();
                    // }
                    int lead=-1;
                    // System.out.print(lead+" ");
                    for(int i=n-1;i>=0;i--){
                              if(arr[i]>lead){
                                        lead=arr[i];
                              }
                              System.out.print(lead+" ");
                    }
                    sc.close();
          }
}
