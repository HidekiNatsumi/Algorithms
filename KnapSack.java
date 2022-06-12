package Algorithms;

public class KnapSack {
    public static void knapSack(){
        int capacity= 10;
        int elements= 6;
        int [] profit =  {0,1,2,3,5,6,8};
        int [] weights = {0,2,1,4,5,7,4};
        int[][] matrix = new int[elements+1][capacity+1];
       // int count = 0;
        for(int i = 0 ; i <=elements;i++){
            for(int w = 0; w<= capacity;w++){
                if(profit[i]==0||weights[i]==0){
                    matrix[i][w]=0;
                 //   count++;
                }
                else if(weights[i]<=w){
                matrix[i][w]=Math.max(profit[i]+matrix[i-1][w-weights[i]],matrix[i-1][w]);
               // count++;
                }
                else{
                  matrix[i][w]=matrix[i-1][w];
                 // count++;
                }
                System.out.print(matrix[i][w]);
            }
         System.out.println();
        }
        int i = elements;
        int w = capacity;
        System.out.println();
        System.out.println("Solutions \nelements with 1 will be added in the bag\nelements with 0 won't be added in the bag");
        while(i>0&&w>0){
            if(matrix[i][w]==matrix[i-1][w]){
                System.out.println(i+" -> 0");
                i--;

            }
            else{
                System.out.println(i+" -> 1");
                w=w-weights[i];
                i--;

            }
        }
    }
    public static void main(String[]args){
knapSack();
    }
}
