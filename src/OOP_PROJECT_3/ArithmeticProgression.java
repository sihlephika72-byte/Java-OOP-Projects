package OOP_PROJECT_3;

public class ArithmeticProgression extends Progression {
    protected long increment;
    ArithmeticProgression(){
        this.increment = 1;
    }
    ArithmeticProgression(long stepsize){
        current = 0;
        this.increment = stepsize;
    }
    ArithmeticProgression(long stepsize, long start){
        current = start;
        this.increment = stepsize;
    }
    @Override
    protected void advance(){
        current += increment;
    }
}
