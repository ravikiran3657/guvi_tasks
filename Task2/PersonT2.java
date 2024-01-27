package Task2;

//base class person
public class PersonT2 {
    //attributes of the person class
    private String name;
    private int age;
    //constructor
    public PersonT2(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayPersonInformation() {
        System.out.println("Name:" + name + " ,Age:" + age);
    }
}
