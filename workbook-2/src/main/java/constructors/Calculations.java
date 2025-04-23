package constructors;

public class Calculations {
    int length;
    int width;
    int area;

    public Calculations(int length, int width, int area) {
        this.length = length;
        this.width = width;
        this.area = area;
    }

    public int calculate(int length, int width){
        return length * width;
    }
}
