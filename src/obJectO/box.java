package obJectO;

public class box {
   double h, w, l;
    box(){
        this.h = 0;
        this.w = 0;
        this.l = 0;

    }
    box(double side){
        this.h = side;
        this.w = side;
        this.l = side;
    }
    box(double l, double w, double h){
        this.h = h;
        this.l = l;
        this.w = w;
    }
}
