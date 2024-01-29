package Task3;

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);

    }
}
 class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String message){
        super(message);
    }}
/*public class Student {
 private int rollNo;
 private String name;
 private int age;
 //private String course;*/

     //parameterized constructor
    /*public Student(int rollNo, String name, int age, String course) throws NameNotValidException, AgeNotWithinRangeException {
        this.rollNo = rollNo;
        //if (!isValidName(name)) {
            throw new NameNotValidException("name s not valid .it should be contain numbers or special symbols ");
            this.name = name;
            if (age < 15 || age > 21) {
                throw new AgeNotWithinRangeException("age should between 15 and 21:");
            }
            this.age = age;
            this.course = course;

        }
    }
}*/
