public class app {
    public static void main(String[] args) {

        house myHouse = new house();
        myHouse.color = "blue";
        myHouse.rooms = 4;
        myHouse.owner = "fernando";
        myHouse.beds3 = false;

        house myHouse2 = new house();
        myHouse2.color = "black";
        myHouse2.rooms = 3;
        myHouse2.owner = "leo";
        myHouse2.beds3 = true;

        car car1 = new car();
        car1.model = 21233;
        car1.color = "white";
        car1.name = "tesla";
        car1.owner2 = "jota";

        car car2 = new car();
        car2.name= "hyundai";
        car2.color= "black";
        car2.model= 14356;
        car2.owner2 = "someone";

        car x = car2;
        x.model = 100000;

        car y = x;
        y.model = 1222;

        myHouse2.openTheDoor();
        car1.startEngine();
        car2.startEngine();
        myHouse.openTheDoor();

    }
}