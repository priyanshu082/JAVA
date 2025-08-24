package OOPS._3_inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box (){
        l = -1;
        w = -1;
        h = -1;
    }

    Box (double side){
        l = w = h = side;
    }

    Box (double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box ob){
        this.l = ob.l;
        this.w = ob.w;
        this.h = ob.h;
    }
}
