package constructors;

public class car {
    final String brand;
    int year;
    boolean isElectric;

    public car(String brand, int year, boolean isElectric) {
        this.brand = brand;
        this.year = year;
        this.isElectric = isElectric;
    }

    public void startEngine(){
        System.out.println("this " + brand +" "+ year + " is electric " + isElectric);
    }
}
