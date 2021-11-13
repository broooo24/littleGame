import java.util.concurrent.ThreadLocalRandom;

public class EnemyCar extends Car{
    int currentRow;
    int currentColumn;
    public EnemyCar() {
        this.currentColumn = ThreadLocalRandom.current().nextInt(0, 5 + 1);
        this.currentRow = 0;
    }

    public void nextTurn(){
        if (this.currentRow== 4){
            this.currentRow = 0;
            this.currentColumn = ThreadLocalRandom.current().nextInt(0, 5 + 1);
        }
        else {
            this.currentRow++;
        }

    }

    public int getCurrentRow() {
        return currentRow;
    }

    @Override
    public int getCurrentColumn() {
        return currentColumn;
    }

    @Override
    public String toString() {
        return "EnemyCar{" +
                "currentRow=" + currentRow +
                ", currentColumn=" + currentColumn +
                '}';
    }
}
