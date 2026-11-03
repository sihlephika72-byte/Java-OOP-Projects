package OOP_PROJECT_3;

public class GeometricProgression extends Progression{
    protected long base;

    GeometricProgression(){
        current = 1;
        this.base = 2;
    }
    GeometricProgression(long b){
        current = 1;
        this.base = b;
    }
    @Override
    protected void advance(){
        current *= base;
    }
}
