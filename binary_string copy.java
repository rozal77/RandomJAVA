package Recursion;

public class binary_string {
    public static void main(String[] args) {
        print_binary_combinations(0,"", 3);
        
    }
    // without consecutive 1s question could be for without consecutive 0s too 
    public static void print_binary_combinations(int lastindex, String str, int n) {
        // base case if n == 0 print out to the display
        if(n==0){
            System.out.println(str);
            return;
        }

        //
        print_binary_combinations(0, str+"0", n-1);
        if(lastindex==0){
            print_binary_combinations(1, str+"1", n-1);
        }
        
    }
}
