import java.util.*;
// Q4. Given a number, count the number of set bits in that number 
// without using an extra space.
// Note : bit ‘1’ is also known as set bit.
public class QThird{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        int n = sc.nextInt();
        // if((n & 1) == 1){
        //     System.out.print("Givent Number is odd: ");
        // }
        if(n % 2 == 0){
            System.out.print("Givent number is Even: "+ n);
        }
        else{
            System.out.print("Given Number is odd: "+n);
        }
    }
}