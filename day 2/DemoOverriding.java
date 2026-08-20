package overriding;
class Parent {
    void show() {
        System.out.println("Acharya");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("snpsu");
    }
}

public class DemoOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();

        Parent c = new Child();
        c.show();
    }
}
