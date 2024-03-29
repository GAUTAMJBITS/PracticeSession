//class Student{
//    int id;
//    String name;
//    char sec;
//
//    public void prinInfo(){
//        System.out.println(this.id);
//        System.out.println(this.name);
//        System.out.println(this.sec);
//    }
//    Student(int id, String name, char sec){
//        this.id= id;
//        this.name = name;
//        this.sec = sec;
//    }
//}
class shape{
    public void area(){
        System.out.println("Displays area");
    }
}
class Triangle extends shape{
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

public class ObjectOrient {
    public static void main(String[] args) {
//        Student s1 = new Student(10, "suman", 'f');
//        s1.prinInfo();
        Triangle t1 = new Triangle();
        t1.area(7, 8);

    }
}
