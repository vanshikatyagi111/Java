package ArrayHomeWork;

public class TrappingRainWater {
          public static void main(String[] args) {
                    int pillars[] = {0,1,0,2,1,0,1,3,2,1,2,1};
                    int n=pillars.length;
                    int pmax[]=new int[n];
                    pmax[0]=pillars[0];
                    for(int i=1;i<n;i++){
                              pmax[i]=Math.max(pmax[i-1],pillars[i]);
                    }
                    int smax[]=new int[n];
                    smax[n-1]=pillars[n-1];
                    for(int i=n-2;i>=0;i--){
                              smax[i]=Math.max(smax[i+1], pillars[i]);
                    }

                    int total=0;
                    for(int i=0;i<n;i++){
                              int current=pillars[i];
                              int leftpillar=pmax[i];
                              int rightpillar=smax[i];
                              int min=Math.min(leftpillar, rightpillar);
                              if(min>current){
                                        total+=min-current;
                              }
                    }
                    System.out.println("Total Trapped Water: "+total);

          }
}
