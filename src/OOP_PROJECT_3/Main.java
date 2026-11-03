package OOP_PROJECT_3;

public class Main {
    public static void main(String[] args){
        Progression prog = new ArithmeticProgression(5);
        prog.printProgression(8);

        prog = new GeometricProgression(3);
        prog.printProgression(6);
    }
}
