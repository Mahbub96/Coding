class QUEUE{
    private int size = 10;
    private int arr[] = new int[size];
    private int front;
    private int rare;
    QUEUE(){
        front = -1;
        rare = 0;
    }
    void push(int x){
        rare %= 10;
        if((rare + 1 == size) && (front < 1) || (front == rare)){
            System.out.println("Queue Overflow");
            return;
        }
        arr[rare++] = x;

    }

    int pop(){
        
        if(front == rare || (front == -1 && rare == 0)){
            System.out.println("Queue Underflow!");
            return -1;
        }
        front++;
        front %= 10;
        /**
         * condition for class retest - 01
         */
        // if(arr[front] < 20) return arr[front++] + 5;
        // else return arr[front++];

        return arr[front];
    }
}

public class sampleQueue {
    public static void main(String[] args) {
        QUEUE q = new QUEUE();
        for(int i = 0; i < 10; i++)
             q.push(i);
        for(int i = 0; i < 10; i++){
            // q.push(i);
            System.out.println(q.pop());
        }

        
    }
}
