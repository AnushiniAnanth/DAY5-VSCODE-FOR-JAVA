import java.util.Scanner;

    public class spiralmatrix {
        public static int[][] initialize(int row,int col){
            Scanner sc=new Scanner(System.in);
            int arr[][]=new int[row][col];
            System.out.println("Enter the array");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            return arr;
        }
        public static void printArray(int [][] array){
            System.out.println("The traversing the array is ");
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    System.out.print(" "+array[i][j]);
                }
                System.out.println();
            }
        }
        public static void spiralTraversal(int[][] matrix,int n,int m){
            int top=0;
            int bottom=m-1;
            int left =0;
            int right=n-1;
            while(top<=bottom && left<=right)
            {
            if(left<=right){
                for(int i=0;i<=right;i++){
                    System.out.println(" "+matrix[top][i]);
                }
                top++;

            }
            if(top<=bottom){
                for(int i=top;i<=bottom;i++){
                    System.out.println(" "+matrix[i][right]);
                }
               right--;

            }
            if(left<=right){
                for(int i=right;i>=left;i--){
                    System.out.println(" "+matrix[bottom][i]);
                }
               bottom--;

            }

            if(top<=bottom){
                for(int i=bottom;i>=top;i--){
                    System.out.println(" "+matrix[i][left]);
                }
               left++;

            }


        }


        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the row");
            int row=sc.nextInt();
            System.out.println("Enter the col");
            int col=sc.nextInt();
            int [][]arr=initialize(row,col);
            printArray(arr);
            spiralTraversal(arr,row,col);


    
    
        }
    
    }
    


