import java.util.Locale;

public class myCar extends Car {
    public myCar(int currentColumn) {
        super(currentColumn);
    }

    public void changeColumn(String movement) {
        //change: R- right L- left
        if (currentColumn < 5 && movement.equalsIgnoreCase("R") ){
            currentColumn++;
        }
        if (currentColumn > 0 && movement.equalsIgnoreCase("L") ){
            currentColumn--;
        }
    }

    public boolean isOver(String[][] enemyCar){
        for (int i = 0;i<6;i++){
            if (enemyCar[4][i]=="x"){
                System.out.println("x");
                if (i==this.currentColumn)return true;
            }
            System.out.println(enemyCar[4][i]);
        }return false;
    }

    @Override
    public String toString() {
        return "myCar{" +
                "currentColumn=" + currentColumn +
                '}';
    }
}
