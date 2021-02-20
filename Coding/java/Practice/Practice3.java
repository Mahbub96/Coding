abstract class bike{
    abstract void run();
}

class Honda extends bike{
    void run(){
        System.out.println("Running safely");
    }
}
class Practice3{
    public static void main(String[] args) {
        Honda obj = new Honda();
        obj.run();
    }
}