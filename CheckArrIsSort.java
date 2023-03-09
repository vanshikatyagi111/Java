package ArrayHomeWork;

import java.util.Scanner;

public class CheckArrIsSort {
          static boolean checkarr(int a[],int n){
                    for(int i=0;i<n-1;i++){
                              if(a[i]>a[i+1]){
                                        return false;
                              }
                    }
                    return true;
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int arr[]=new int[n];
                    for(int i=0;i<n;i++){
                              arr[i]=sc.nextInt();
                    }
                    if(checkarr(arr, n)){
                              System.out.println("Yes Sorted!");
                    }
                    else{
                              System.out.println("Not Sorted");
                    }
                    sc.close();
          }
}
