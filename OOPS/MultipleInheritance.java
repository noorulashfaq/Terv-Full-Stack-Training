/**
 * InnerMultipleInheritance
 */
interface Outer {

    void run();

}

interface MulInherInterface extends Outer {

    void jump();

}

class MulInherClass implements MulInherInterface {

    public void run() {
        System.out.println("Running");
    }

    public void jump() {
        System.out.println("Jumping");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        MulInherClass mc = new MulInherClass();
        mc.run();
        mc.jump();
    }
}
