package Task2;
//In the "Person"  class has two private attributes: name and age,
// and a constructor that initializes these attributes with the values passed as arguments.
// It also has a getter method to access the attributes.
public class PersonMainClass {

    void display(){
        System.out.println();
    }
    public static void main(String[] args) {
        Person person1=new Person("Kiran",25);
        Person person2 = new Person("RK",30);
        System.out.println(person1.getName() + "is" + person1.getAge());
        System.out.println(person2.getName() + "is" + person2.getAge());
    }
}
