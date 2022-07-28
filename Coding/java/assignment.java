import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int times = 0;
        System.out.print("Enter Size of Array : ");
        int n = scan.nextInt();
        
        
        
        int[] arr = new int[n];
        System.out.print("Enter values of array : ");
        
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        
        
        
        System.out.print("Enter number to find how many times occures : ");
        int x = scan.nextInt();
        
        
        
        for(int i = 0; i < n; i++ ){
            if(arr[i] == x){
                times++;
            }
        }
        
        System.out.println(x+" Occures "+times+" times in this array");

    }
}
