import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        
        System.out.print("Enter a large number : ");
        int n = op.nextInt();
        
        int sum = 0;
        
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
        
        
        
    }
}
