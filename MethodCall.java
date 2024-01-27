public class MethodCall {
    //Multiple Parameters
    //You can have as many parameters
    static void myMethod(String fname,int age,String addree){
        System.out.println(fname +  " is "  + age);
    }
    //inside main, call the myMethod() method
    //A method can also be called multiple times:
    public static void main(String[] args) {
        myMethod("ravi",30,"HYd");
        myMethod("mamatha",28,"ap");
        myMethod("vidwan",7,"xak");
        myMethod("aarayanash",4,"ts");

    }
}
