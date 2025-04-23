package constructors;
class person{
    private String name;
    private int age;
    public person(int age){
        if (age < 0){
            System.out.println("age can't be below zero: setting it to 0");
        }else {
            this.age = age;
        }
    }
}
