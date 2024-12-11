package interfaceexample;

public class SampleClass implements SampleInterface, SampleInterface2{
    @Override
    public void demo1() {
        System.out.println("abc value is : "+SampleInterface.abc);
        System.out.println("demo1 implementation inside SampleClass");
    }

// added
    @Override
    public void demo2() {
        System.out.println("demo2 implementation inside SampleClass");
    }
	// added
    @Override
    public void demo3() {
        System.out.println("demo3 implementation inside SampleClass");
    }
}
