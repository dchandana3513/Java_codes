// Question :Print maximum subarray sum and the subarray
//kadanes algorithm
import java.util.*;
class Maxsubarraysum  {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int maxsum=arr[0];
        int sum=0, start=0,end=0, s=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxsum){
                maxsum=sum;
                start=s;
                end=i;}
            if(sum<0){
                sum=0;
                s=i+1;
            } }
      System.out.print("Subarray with maximum sum is: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");}
    System.out.println();
    System.out.println("maxsum : "+maxsum);}}

/* Input: arr=[-2,1,-3,4,-1,2,1,-5,4]
Output:   Subarray with maximum sum is: 4 -1 2 1 
          maxsum : 6 */
