class Statics{
    static int count = 0;
    Statics(){
        count++;
        System.out.println(count);
    }
}

class StaticExample {
    public static void main(String[] args) {
        Statics.count = 5;
        new Statics();
        new Statics();
        new Statics();

    }

}


