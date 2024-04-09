// First interface
interface Interface1 {
    void method1();
}

// Second interface
interface Interface2 {
    void method2();
}

// Class implementing both interfaces
class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 from Interface1");
    }

    public void method2() {
        System.out.println("Method 2 from Interface2");
    }
}

public class Lab6 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Call methods from both interfaces
        myClass.method1();
        myClass.method2();
    }
}