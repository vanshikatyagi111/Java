package ArrayHomeWork;

import java.util.Scanner;

public class TwoSum {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int arr[]=new int[n];
                    for(int i=0;i<n;i++){
                              arr[i]=sc.nextInt();
                    }
                    int k=sc.nextInt();
                    // int arr[]= {2,1,5,6,3,7}, k = 11;
                    for(int i=0;i<arr.length;i++){
                              for(int j=i;j<arr.length;j++){
                                        if(arr[i]+arr[j]==k){
                                                  System.out.println(i+" "+j);
                                        }
                              }
                    }
                    sc.close();
          }
}
