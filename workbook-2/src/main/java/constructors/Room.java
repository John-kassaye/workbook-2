package constructors;

public class Room {
     String name;

    public Room(String name){
        this.name = name;
    }
}

class House{
     Room room;

     public House(Room room) {
        this.room = room;
    }

    public void house1(){
        System.out.println("This house has a room called: " + room.name);
    }
}
