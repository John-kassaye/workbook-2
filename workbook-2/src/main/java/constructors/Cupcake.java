package constructors;

public class Cupcake {
    String flavor;
    int calories;
    public Cupcake(String flavor, int calories){
        this.flavor = flavor;
        this.calories = calories;

        System.out.println("created a cupcake: " + flavor + " " + calories + " Kcal");
    }
    public boolean isHealthy(int calories){
       boolean result = false;
        if (calories < 200){
            result = true;
        }
        return result;
    }

}