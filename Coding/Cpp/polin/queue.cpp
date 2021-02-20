 #include<iostream>
 using namespace std;

 class Q {
     public:
    int que[10];
    int in=-1;
    int out=0;

    Q()
    {
    }
    void push(int temp)
    {
        if(in >= 9) cout <<("Queue Full") << endl;
        else{
            in++;
            que[in]=temp;
        }
    }
    void pop()
    {
        for(int i=0;i<(sizeof(que)/4)-1;i++)
        {
            que[i] = que[i+1];
        }
        in--;
        que[(sizeof(que)/4)-1]=0;
    }
    void print()
    {
        for(int i=0;i< 10;i++)
        {
            cout << (que[i]) << endl;
        }
    }

};

int main()
{
    Q ob;
    for (int i = 0; i < 5; i++)
    {
        ob.push(i);
        ob.pop();
    }

    ob.print();
    

    return 0;
}
