package ArrayHomeWork;

import java.util.Scanner;

public class Sort0and1 {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int arr[]={0,1,0,0,1,1,0,0,0,1,1};

                    // O(n)
                    int n=0;
                    for(int i=0;i<arr.length;i++){
                              if(arr[i]==0){
                                        n++;
                              }
                    }
                    for(int i=0;i<n;i++){
                              arr[i]=0;
                    }
                    for(int i=n;i<arr.length;i++){
                              arr[i]=1;
                    }
                    
                    // print array
                    for(int i=0;i<arr.length;i++){
                              System.out.print(arr[i]+" ");
                    }
                    sc.close();
          }
}
