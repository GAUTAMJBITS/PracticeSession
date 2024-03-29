public class Summy {

   String name;
    int roll;
    int percent ;

//    public Summy(String name, int , int i1) {
//    }

    public Summy(String name, int roll, int percent){
        this.name = name;
        this.roll = roll;
        this.percent= percent;
    }
    public void display(){
        System.out.println("name :" +name +" roll:"+roll+"percent: "+percent);
    }
}
