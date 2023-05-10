import java.util.Scanner;

public class FindPower {
    public static int Powerfind(int a, int b){
        int mid = 0, result = 0, findresult = 0;
        // Base case Condistion
        if(b==1){
            return a;
        }
        else{
            mid = b/2;
            // Recursive Function Call
            result = Powerfind(a, mid);
            findresult = result *result;
            if(b%2==0){
                return findresult;
            }else{
                return a*findresult;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter THe Element of a, And b: ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int result = Powerfind(a,b);
        System.out.println("a^b is "+result);
    }
}
