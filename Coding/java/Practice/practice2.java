class A{
    A(){
        System.out.println("Hello A");
    }
    A(int x){
        this();
        System.out.println(x);
    }
}

class practice2{
    public static void main(String[] args) {
        new A(10);
    }   
}