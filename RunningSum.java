package ArrayHomeWork;

import java.util.Scanner;

public class RunningSum {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int[] nums={1,2,3,4,5};
                    int sum=0;
                    for(int i=nums.length-1;i>=0;i--){
                              sum=nums[i];
                              for(int j=i-1;j>=0;j--){
                                        sum+=nums[j];
                              }
                              nums[i]=sum;
                    }
                    for(int i=0;i<nums.length;i++){
                              System.out.print(nums[i]+" ");
                    }
                    sc.close();
          }
}
