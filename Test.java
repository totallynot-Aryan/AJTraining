package interfaceDemo;
public class Test implements I1,I2{
    @Override
    public void fun1(){
        System.out.println("Fun1 is called");
    }
    @Override
    public void fun(){
        System.out.println("Fun is called");
    }
    @Override
    public void show(){
        System.out.println("Show is called");
    }
}

