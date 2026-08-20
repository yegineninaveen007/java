package superclass;
class Parent {
    int a = 10;
    int b = 20;

    void display() {
        System.out.println("Parent values: a = " + a + ", b = " + b);
    }
}

public class Demo2 extends Parent {
    int a = 30;
    int b = 40;

    @Override
    void display() {
        // Using super to access parent variables
        System.out.println("Parent sum: " + (super.a + super.b));
        // Using this to access child variables
        System.out.println("Child sum: " + (this.a + this.b));
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();   // Calls Parent version

        Demo2 d = new Demo2();
        d.display();   // Calls Child overridden version
    }
}
