package problems;

import java.util.Scanner;

public class ArrayOperation {
	
	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        
	        System.out.println("첫번째 행렬 크기 입력");
	        int x = scan.nextInt();
	        int y = scan.nextInt();
	        
	        System.out.println("두번째 행렬 크기 입력");
	        int x2 = scan.nextInt();
	        int y2 = scan.nextInt();
	        
	        int[][] arr = new int[x][y];
	        int[][] arr2 = new int[x2][y2];
	        
	        int[][] arr3 = new int[x][y2];
	        
	        
	        System.out.println("첫번째 행렬 값 입력");
	        for(int i=0; i<x; i++){
	            for(int j=0; j<y; j++){
	                arr[i][j] = scan.nextInt();
	            }
	        }
	        
	        System.out.println("두번째 행렬 값 입력");
	        for(int i=0; i<x2; i++){
	            for(int j=0; j<y2; j++){
	                arr2[i][j] = scan.nextInt();
	            }
	        }
	        
	        //행렬곱셈
	        for(int i=0; i<x; i++){
	            for(int j=0; j<y2; j++){
	                int sum = 0;
	                for(int k=0; k<y; k++){
	                    sum+=arr[i][k]*arr2[k][j];
	                }
	                arr3[i][j] = sum;
	            }            
	        }
	        
	        
	        
	        //출력
	        for(int i=0; i<x; i++){
	            for(int j=0; j<y2; j++){
	                System.out.print(arr3[i][j] + " ");
	            }
	            System.out.println();
	        }
	}

}
