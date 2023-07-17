import java.util.Scanner;

class ColumnSum{
    public void findColumnSum(int row ,int col ,int arr[][]){
        int ar[]=new int[col];
        for(int i=0;i<col;i++){
            int sum=0;
            for (int j=0;j<row;j++){
                sum+=arr[j][i];
            }
            ar[i]=sum;
        }
        for(int i=0;i<col;i++){
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ColumnSum columnSum=new ColumnSum();
        System.out.println("Enter no of row  :");
        int row= scanner.nextInt();
        System.out.println("Enter no of col  :");
        int col= scanner.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++) {

            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Column Sum :");
        columnSum.findColumnSum(row,col,arr);


    }
}