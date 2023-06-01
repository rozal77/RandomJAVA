package Recursion;

public class tilingproblem {
    public static void main(String[] args) {
       System.out.println(noofways(6));
        
    }
    public static int noofways(int n) {
        if(n==0||n==1){
            return 1;
        }
        // vertical ways
        int total_vertical = noofways(n-1);

        // horizontal ways
        int horizontal_ways = noofways(n-2);
        return total_vertical+horizontal_ways;
        
    }
    
}
