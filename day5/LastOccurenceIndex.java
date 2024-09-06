import java.util.Scanner;
public class LastOccurenceIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n=sc.nextInt();
        System.out.println("Enter the array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element:");
        int x=sc.nextInt();
        int j=-1;
        for(int i=n-1;i>=0;i--){
           
            if(arr[i]==x){
                j=i;
               

                
            }
            
           
        }
        System.out.println("The last occurence is "+(n-j));
    }

}
