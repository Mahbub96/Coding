
class Test{
    int a,b;

    /**
     * Constractor for this class
     * @param a
     * @param b
     */
    Test(int a,int b){
        this.a = a;
        this.b = b;
    }
    /**
     * Check two objects are equal or not
     * @param ob
     * @return boolean
     */

    boolean isEqual(Test ob){
        if((ob.a == this.a) && (ob.b == this.b)){
            return true;
        }
        else return false;
    }
}

public class practice1{
    public static void main(String[] args) {
        Test ob1 = new Test(0,2);
        Test ob2 = new Test(1,2);
        Test ob3 = new Test(1,2);

        System.out.println(ob1.isEqual(ob2));
        System.out.println(ob2.isEqual(ob3));
    }
}