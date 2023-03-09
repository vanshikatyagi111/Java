package ArrayHomeWork;

import java.util.Scanner;

public class RotateArray {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int d=3;
                    int arr[]={1,2,3,4,5,6,7};
                    int n=arr.length;
                    int b[]=new int[d];
                    for(int i=0;i<d;i++){
                              b[i]=arr[i];
                    }
                    for(int i=0;i<n-d;i++){
                              arr[i]=arr[i+d];
                    }
                    int j=0;
                    for(int i=n-d;i<n;i++){
                              arr[i]=b[j];
                              j++;
                    }
                    for(int i=0;i<n;i++){
                              System.out.print(arr[i]+" ");
                    }
                    sc.close();
          }
}
