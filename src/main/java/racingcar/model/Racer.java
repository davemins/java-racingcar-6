package racingcar.model;

public class Racer {

    private String name;
    private int moveCount = 0;
    private boolean state = false;

    public Racer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getMoveCount() {
        return this.moveCount;
    }

    public boolean getState() {
        return this.state;
    }

    public void plusMoveCount() {
        this.moveCount += 1;
    }

    public void goState() {
        this.state = true;
        plusMoveCount();
    }

    public void stopState() {
        this.state = false;
    }
}