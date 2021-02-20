
package samplequeue;
class QUEUE{
    private int size;
    private int arr[];
    private int front;
    private int rare;
    private int temp;

    /**
     * default Constructor and size : 10
     */
    QUEUE(){
        size = 10;
        front = -1;
        rare = 0;
        temp = 0;
        arr = new int[size];
    }

    /***
     * Constructor 
     * @param size
     */
    QUEUE(int size){
        this.size = size;
        front = -1;
        rare = 0;
        temp = 0;
        arr = new int[size];
    }


    void push(int x){
        rare %= 10;
        if((rare + 1 > size) && (front < 1) || (front == rare)){
            System.out.println("Queue Overflow");
            return;
        }
        arr[rare++] = x;
        temp %= 10;
        temp++;
       // System.out.println(arr[rare-1]);
        //System.out.println("temp-"+temp);

    }

    int pop(){
        front++;
        if(front == rare || temp == 0 || (front == -1 && rare == 0)){
            System.out.println("Queue Underflow!");
            front--;
            return -1;
        }

        /**
         * condition for class retest - 01
         */
        // if(arr[front] < 20) return arr[front++] + 5;
        // else return arr[front++];

        front %= 10;
        temp--;
        return arr[front];
    }
}

public class sampleQueue {
    public static void main(String[] args) {
        
        new QUEUE(10);
    }
}