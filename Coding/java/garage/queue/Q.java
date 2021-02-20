
package queue;

public class Q {
    int queue[];
    int in=-1;
    int out=0;
    
    public Q()
    {
        queue = new int[10];
    }
    public void push(int temp)
    {
        if(in >= 9) System.out.println("Queue Full");
        else{
            in++;
            queue[in]=temp;
        }
    }
    public void pop()
    {
        for(int i=0;i<queue.length-1;i++)
        {
            queue[i] = queue[i+1];
        }
        in--;
        queue[queue.length-1]=0;
    }
    public void print()
    {
        for(int i=0;i<queue.length;i++)
        {
            System.out.println(queue[i]);
        }
    }
    
}
