class Student{
    private int roll;
    private String name;
    static String college = "Stamford University Bangladesh !";

    Student(String name,int roll){
        this.name = name;
        this.roll = roll;
    }
    static void change(){
        college = "SUB";
    }
    void display(){
        System.out.println(roll +" "+name+" "+college);
    }


}

public class Practice3 {
    public static void main(String[] args) {
        Student s1 = new Student("Mahbub",27);
        Student s2 = new Student("Tisha",26);

        Student.change();

        s1.display();
        s2.display();
    }
}
