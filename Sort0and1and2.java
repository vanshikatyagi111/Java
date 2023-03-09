package ArrayHomeWork;

import java.util.Scanner;

public class Sort0and1and2 {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    // int arr[]={0,1,1,1,0,0,2,2,1,0,1,0,2,2};
                    int arr[]={1,0,0,1,2,1,2};
                    int n=0,m=0;
                    for(int i=0;i<arr.length;i++){
                              if(arr[i]==0){
                                        n++;
                              }
                              else if(arr[i]==1){
                                        m++;
                              }
                    }
                    for(int i=0;i<n;i++){
                              arr[i]=0;
                    }
                    for(int i=n;i<n+m;i++){
                              arr[i]=1;
                    }
                    for(int i=n+m;i<arr.length;i++){
                              arr[i]=2;
                    }

                    // print array
                    for(int i=0;i<arr.length;i++){
                              System.out.print(arr[i]+" ");
                    }
                    sc.close();
          }
}
