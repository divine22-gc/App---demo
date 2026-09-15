import java.util.*;

public class InnerAnonymousDemo {

    // ---------- Inner Class ----------
    class InnerDisplay {
        void show(String msg) {
            System.out.println("Inner Class says: " + msg);
        }
    }

    void demonstrateInnerClass() {
        InnerDisplay id = new InnerDisplay();
        id.show("Hello from Inner Class!");
    }

    // ---------- Interface used for Anonymous Class ----------
    interface Greeting {
        void greet();
    }

    void demonstrateAnonymousClass() {
        // Anonymous class implementing the interface on the fly
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Anonymous Class says: Hello!");
            }
        };
        greeting.greet();
    }

    public static void main(String[] args) {
        InnerAnonymousDemo outer = new InnerAnonymousDemo();

        System.out.println("---- Inner Class Demo ----");
        outer.demonstrateInnerClass();

        System.out.println("\n---- Anonymous Class Demo ----");
        outer.demonstrateAnonymousClass();

        // Extra: Anonymous class using Runnable (common real-world use)
        System.out.println("\n---- Anonymous Class with Runnable ----");
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Runnable is running!");
            }
        };
        r.run();
    }
}