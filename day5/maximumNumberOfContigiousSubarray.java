import java.util.Scanner;
import java.util.*;
public class maximumNumberOfContigiousSubarray {
    public static int maxSubArr(int[] arr){
        int max=arr[0];
        int curArr=arr[0];
        for(int i=0;i<arr.length;i++){
            curArr=Math.max(arr[i],curArr+arr[i]);
            max=Math.max(max,curArr);
        }

       return max;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int max=maxSubArr(arr);
        System.out.println("The max sum is "+max);
        
    }

}
