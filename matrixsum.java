import java.util.Scanner;

public class matrixsum {
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter no of rows and columns: ");
        int x=scn.nextInt();
        int y=scn.nextInt();
        int mat1[][]=new int[x][y];
        int mat2[][]=new int[x][y];


        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                mat1[i][j]=scn.nextInt();
            }
        }

        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[0].length;j++){
                mat2[i][j]=scn.nextInt();
            }
        }
        //printing both matrix
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                System.out.print(" "+mat1[i][j]);
            }
            System.out.println("");
        }
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[0].length;j++){
                System.out.print(" "+mat2[i][j] );
            }
            System.out.println("");
        }

        //Adding two Matrix
        int sum[][]=new int[x][y];
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[0].length;j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        //Printing Sum of Matrix
        System.out.println("Sum Of two Matrix is:");
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[0].length;j++){
                System.out.print(" "+sum[i][j]);
            }
            System.out.println("");
        }
    }
    
}
