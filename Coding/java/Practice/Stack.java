class Stack{
    private int size;
    private int arr[];
    private int tos;

    /**
     * Default constructor and default size : 10
     */
    Stack(){
        size = 10;
        arr = new int[size];
        tos = -1;
    }
    /**
     * Constructor
     * @param size
     */
    Stack(int size){
        this.size = size;
        arr = new int[size];
        tos = -1;
    }

    void push(int val){
        if((tos + 1) == size){
            System.out.println("Stack overflow!");
            return;
        }
        arr[++tos] = val;
    }

    int pop(){
        if(tos == -1){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return arr[tos--];
    }

}

class StackDemo{
    public static void main(String[] args) {
        Stack s = new Stack();
         for (int i = 0; i < 11; i++) {
            s.push(i);
         }

         for (int i = 0; i < 11; i++) {
             System.out.println(s.pop());
         }
        
    }
}
