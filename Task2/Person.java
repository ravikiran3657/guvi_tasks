package Task2;
//Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
