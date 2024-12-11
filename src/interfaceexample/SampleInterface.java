package interfaceexample;

public interface SampleInterface {
    public int abc=100;
    public final int xyz=200;
// added
    public void demo1();

    public abstract void demo2();
    private void demo3(){
        System.out.println("private demo3 body");
    }
}
