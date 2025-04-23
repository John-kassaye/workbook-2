package constructors;
public class BasicConstructors {
    public static void main(String[] args) {

//        #1
        Book book1 = new Book("java by maiike","maikke",12);
        System.out.println(book1.author);

//        #2 and #3
        book1.book("java ","maikke ",20);

//        #4
       Book book2 = new Book("python","john",30);
       book2.book();
       Book book3 = new Book("C++","kaka",50);
       book3.book();

//       #5

        Book book4 = new Book();
        book4.book();

//        #6
        Cupcake cupcake1 = new Cupcake("vanilla",100);

//        #7
        Cupcake cupcake2 = new Cupcake("vaniila",190);
        boolean result2 = cupcake2.isHealthy(290);
        System.out.println(result2);

//        #8
        person person1 = new person(-20);

//        #11
        car car1 = new car("toyota",2017,false);
        car car2 = new car("tesla",2024,true);
        car1.startEngine();
        car2.startEngine();

//        #12
        Room room1 = new Room("kitchen");
        House house1 = new House(room1);
        house1.house1();

        //#13
        Calculations newArea = new Calculations(10,5,0);
        int Area = newArea.calculate(10,5);
        System.out.println(Area);
    }
}
