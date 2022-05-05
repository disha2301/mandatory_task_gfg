import java.util.Scanner;
class Nearest_twin_prime{
    public static boolean isPrime(int n){//function to check whether a number is prime or not
        for(int x=2;x<=n/2;x++)
        {
            if(n%x==0)//to check for prime numbers
            return false;// flag to return false if the given number is not prime else true
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");//To take a user define input to check for twin prime around the given input
        int n=sc.nextInt();//to store the input number
        if(isPrime(n-1) && isPrime(n+1))
        System.out.println((n-1)+" , "+(n+1));
        else
        {
            int d=0;
            boolean found=false;
            while(found==false){
                if(isPrime(n-d-2) && isPrime(n-d)){
                    System.out.println((n-d-2)+" , "+(n-d));//to check for two numbers before and two numbers after the given input
                    found=true;
                }
                if(isPrime(n+d) && isPrime(n+d+2)){
                    System.out.println((n+d)+" , "+(n+d+2));
                    found=true;
                }
                d++;
            }
        }
    }
}