package ArrayHomeWork;

import java.util.Scanner;

public class BuySellStock {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    // int arr[]={7,8,1,5,2,3,6,4};
                    int arr[]={7,2,3,8,1,4};

                    // O(n^2)
                    // int max=-1,min=-1;
                    // for(int i=arr.length-1;i>=0;i--){
                    //           for(int j=i;j>=0;j--){
                    //                     min=arr[i]-arr[j];
                    //                     if(max<min){
                    //                               max=min;
                    //                     }
                    //           }
                    // }
                    // System.out.println(max);


                    // prefix-min approach O(n)
                    // int n=arr.length;
                    // int prefixmin[]=new int[n];
                    // prefixmin[0]=arr[0];
                    
                    // for(int i=1;i<n;i++){
                    //           prefixmin[i]=Math.min(prefixmin[i-1], arr[i]);
                    // }
                    // // prefixmin[]={7,2,2,2,1,1}
                    
                    // for(int i=0;i<n;i++){
                    //           arr[i]=arr[i]-prefixmin[i];
                    // }
                    
                    // int max=-1;
                    // for(int i=0;i<n;i++){
                    //           if(max<arr[i]){
                    //                     max=arr[i];
                    //           }
                    // }
                    // System.out.println(max);

                    // without using prefix array O(n) O(1)
                    int n=arr.length;
                    int profit=0;
                    int finalprofit=0;
                    int min=arr[0];
                    for(int i=0;i<n;i++){
                              finalprofit=arr[i]-min;
                              profit=Math.max(profit, finalprofit);
                              min=Math.min(min, arr[i]);
                    }
                    System.out.println(profit);
                    sc.close();
          }
}
