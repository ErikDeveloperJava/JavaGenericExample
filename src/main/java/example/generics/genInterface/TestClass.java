package example.generics.genInterface;

public class TestClass {

    public static void main(String[] args) {
        GenInterface<Integer> genInterface = new GenInterfaceImpl<>();
        double square = genInterface.square(2);
        double percent = genInterface.percent(15, 45);
        System.out.println("square of 2 = " + square);
        System.out.println("45 percent 50 =  " + percent + "%");
    }
}
