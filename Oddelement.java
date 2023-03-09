package ArrayHomeWork;

import java.util.Scanner;

public class Oddelement {
          // find unique element occured in array if others repeated twicely
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int arr[]= {1,1,2,2,3,3,4,5,5,6,6};
                    int res=0;
                    for(int i=0;i<arr.length;i++){
                              res^=arr[i];
                    }
                    System.out.println(res);
                    sc.close();
          }
}
