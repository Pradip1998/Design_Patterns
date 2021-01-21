class Wheel{
    int size;
    public Wheel(int wheelsize){
        size=wheelsize;
    }
}
class Frame{
    int len;
    public Frame(int framelen){
        len =framelen;
    }
}

public class Bike{
    Bike(int wheelsize, int framelen){
        Wheel w1=new Wheel(wheelsize);
        Frame f1=new Frame(framelen);
    }
    public static void main(String[] args){
        Bike bike=new Bike(2,3);


    }
    

}
