import java.util.Arrays;

public class ArrayEnemyCar {
    String [][] enemyCar = {
            {" "," "," "," ", " "," "},
            {" "," "," "," ", " "," "},
            {" "," "," "," ", " "," "},
            {" "," "," "," ", " "," "},
            {" "," "," "," ", " "," "},
    };

    public String[][] getEnemyCar() {
        return enemyCar;
    }

    public void addEnemyCar(int currentColumn, int currentRow){
        enemyCar[currentRow][currentColumn] = "x";
    }

    public void deleteEnemyCar(int currentColumn,int currentRow){
        enemyCar[currentRow][currentColumn] = " ";
    }

    public void showEnemyCar(){
        System.out.println(Arrays.deepToString(this.enemyCar));
    }
}
