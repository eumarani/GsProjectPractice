package com.excelSheet;

public class DiagonalMatrix {
    public static boolean checkMatrix(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows!=cols){
            return false;
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i!=j && matrix[i][j]!=0){
                    return false;
                }
            }

        }
        return true;
    }
    public static void main(String[] args){
        int[][] matrix={
                {3,0,0},
                {0,1,0},
                {0,0,1}
        };

       System.out.println(checkMatrix(matrix)) ;

        int[][] matrix1={
                {1,8,0},
                {0,1,0},
                {0,0,1}
        };

        System.out.println(checkMatrix(matrix1)) ;
    }
}
