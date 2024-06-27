package Inheritance;
class ComputerScience {

    ComputerScience() {
        System.out.println("Computer Science is an interesting subject !!");
    }

    void produce(){
        System.out.println("Produced by ComputerScience class");
    }

}

class Programming extends ComputerScience {

    Programming() {
        System.out.println("Programming requires logical thinking");
    }

    void show(){
        System.out.println("Showing text from Programming class");
    }

}

class JavaProgramming extends Programming {

    JavaProgramming() {
        System.out.println("Java is a popular programming language");
    }

    void display(){
        show();
        System.out.println("I am displaying from JavaProgramming class");
    }

}

public class MultilevelInheritanace {

    public static void main(String[] args) {

        JavaProgramming jp = new JavaProgramming();
        jp.display();
        System.out.println("-----------------------------------");

        Programming p = new Programming();
        p.show();

    }
}
