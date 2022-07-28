import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        
        System.out.print("Enter large number : ");
        int value = op.nextInt();
        System.out.print("Enter large number : ");
        int n = op.nextInt();
        
        String s = String.valueOf(value);
        try{
            System.out.println(s.charAt(n-1));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
