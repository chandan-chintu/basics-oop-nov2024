package polymorphismexample;

public class MainClass {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();

        sampleClass.sum(10,23);
        sampleClass.sum(3,6,8);
        sampleClass.sum(3.04,4.66);
        sampleClass.sum(2.05f,1.023f);

    }
}
