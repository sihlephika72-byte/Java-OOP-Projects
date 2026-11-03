package OOP_PROJECT_3;

public abstract class Progression {

    protected long current;

    public Progression() {

        this(0);
    }

    public Progression(long start) {

        this.current = start;
    }


    public long nextValue() {
        long answer = current;
        advance();
        return answer;
    }

    public void printProgression(int n) {
        System.out.print(nextValue());
        for (int j = 1; j < n; j++) {
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }

    protected abstract void advance();
}