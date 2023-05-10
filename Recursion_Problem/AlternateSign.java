import java.util.*;
public class AlternateSign {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        else if (n%2 == 0) {
            return sum(n-1)-n;
        } else {
            return sum(n-1)+n;
        }
        // (n%2 == 0){
        //     return sum(n-1)+n;
        // }
        // else{
        //     return sum(n-1)+n;
        // }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num =  sc.nextInt();
        int show = sum(num);
        System.out.println("the Alternate Sign Sum is: "+show);
    }
}
