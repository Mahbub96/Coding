public class Queue {

    public static void main(String[] args) {
        Q ob = new Q();
        int i;
        
        for(i=1;i<=10;i++)
        {
            ob.push(i);
            
        }
        for(int j = 0; j < 7; j++){
            ob.pop();
        }
        ob.push(1);
        ob.push(1);
        ob.push(1);
        

        
    }
}
