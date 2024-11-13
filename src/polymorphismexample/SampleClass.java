package polymorphismexample;

public class SampleClass {

    public void sum(int a, int b){
        System.out.println("sum of two integer numbers is : "+(a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("sum of three integer numbers is : "+(a+b+c));
    }

    public void sum(float a, float b){
        System.out.println("sum of two float numbers is : "+(a+b));
    }

    public void sum(double a, double b){
        System.out.println("sum of two double numbers is : "+(a+b));
    }
}
