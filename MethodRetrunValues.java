//in this below example return of method one/two parameter
public class MethodRetrunValues {
  /*  *//*static int myMethod(int x){//int x => is one parameter
        return 5+x;*//*
    static int myMethod(int x, int y){//int x, int y => two parameters
//This example returns the sum of a method's two parameters:
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(9,10));
    }*/
    //we can also store the result in a variable (recommended, as it is easier to read and maintain):

    //Method overloading, multiple methods can have same name with different parameters
    //int myMethod(int a);
    //float myMethod(float a);
    //double myMethod(double a,double b);
    //in this below one,which has two methods that add numbers of different type:
    /*static int addMethodInt(int a,int b){
        return a+b;

    }
   *//* static float addMethodFloat(float a,float b){

        return a+b;
    }*//*
    static double addMethodDouble(double a,double b){

        return a+b;
    }
//Instead of defining two methods that should do the same thing, it is better to overload one.
    public static void main(String[] args) {
        int num1= addMethodInt(23,32);
        System.out.println(num1);
        double num2=addMethodDouble(10.9,9.9);
        System.out.println(num2);
    }*/
    //In the example below, we overload the Method method to work for both int and double:
    static int Method(int x, int y) {
        return x + y;
    }

    static double Method(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = Method(8, 5);
        double myNum2 = Method(4.3232223, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
