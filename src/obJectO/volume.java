package obJectO;

public class volume extends box{
    box b = new box(h, w, l);

    public volume(double h, double l, double w){
        b.h = h;
        b.l = l;
        b.w = w;

        double vol = h * l * w;
    }


}
