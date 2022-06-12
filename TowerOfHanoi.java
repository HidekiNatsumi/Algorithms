package Algorithms;

public class TowerOfHanoi {
    public static void main(String[] args) {
hanoi(3,"A","B","C");
    }
    public static void hanoi(int n , String a,String b, String c){
        if(n>0){
            hanoi(n-1 ,a,c,b);
            System.out.println("The disc moved from " +a +" to "+ c);
            hanoi(n-1, b,a,c);
        }
    }
}
