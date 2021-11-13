import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        //Show.showMyPosition(1);
        String [][] enemyCar = {
                {" "," "," "," ", " "," "},
                {" "," "," "," ", " "," "},
                {" "," "," "," ", " "," "},
                {" "," "," "," ", " "," "},
                {" "," ","x","x", " "," "},
        };

        //my car
        myCar myCar = new myCar(2);
        myCar.changeColumn("R");
        System.out.println(myCar);

        ArrayEnemyCar arrayEnemyCar = new ArrayEnemyCar();
        EnemyCar enemyCar1 = new EnemyCar();
        EnemyCar enemyCar2 = new EnemyCar();
        EnemyCar enemyCar3 = new EnemyCar();
        EnemyCar enemyCar4 = new EnemyCar();
        EnemyCar enemyCar5 = new EnemyCar();

        System.out.println(enemyCar1);
        arrayEnemyCar.addEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
        arrayEnemyCar.showEnemyCar();
        arrayEnemyCar.deleteEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
        arrayEnemyCar.showEnemyCar();
        enemyCar1.nextTurn();
        arrayEnemyCar.addEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
        arrayEnemyCar.showEnemyCar();

        System.out.println(enemyCar2);
        arrayEnemyCar.addEnemyCar(enemyCar2.getCurrentColumn(), enemyCar2.getCurrentRow());
        arrayEnemyCar.showEnemyCar();
        arrayEnemyCar.deleteEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
        arrayEnemyCar.deleteEnemyCar(enemyCar2.getCurrentColumn(), enemyCar2.getCurrentRow());

        enemyCar1.nextTurn();
        enemyCar2.nextTurn();

        arrayEnemyCar.addEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
        arrayEnemyCar.addEnemyCar(enemyCar2.getCurrentColumn(), enemyCar2.getCurrentRow());
        arrayEnemyCar.addEnemyCar(enemyCar3.getCurrentColumn(), enemyCar3.getCurrentRow());
        arrayEnemyCar.showEnemyCar();
        arrayEnemyCar.deleteEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
        arrayEnemyCar.deleteEnemyCar(enemyCar2.getCurrentColumn(), enemyCar2.getCurrentRow());
        arrayEnemyCar.deleteEnemyCar(enemyCar3.getCurrentColumn(), enemyCar3.getCurrentRow());

        enemyCar1.nextTurn();
        enemyCar2.nextTurn();
        enemyCar3.nextTurn();

        arrayEnemyCar.addEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
        arrayEnemyCar.addEnemyCar(enemyCar2.getCurrentColumn(), enemyCar2.getCurrentRow());
        arrayEnemyCar.addEnemyCar(enemyCar3.getCurrentColumn(), enemyCar3.getCurrentRow());
        arrayEnemyCar.addEnemyCar(enemyCar4.getCurrentColumn(), enemyCar4.getCurrentRow());
        arrayEnemyCar.showEnemyCar();
        arrayEnemyCar.deleteEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
        arrayEnemyCar.deleteEnemyCar(enemyCar2.getCurrentColumn(), enemyCar2.getCurrentRow());
        arrayEnemyCar.deleteEnemyCar(enemyCar3.getCurrentColumn(), enemyCar3.getCurrentRow());
        arrayEnemyCar.deleteEnemyCar(enemyCar4.getCurrentColumn(), enemyCar4.getCurrentRow());

        enemyCar1.nextTurn();
        enemyCar2.nextTurn();
        enemyCar3.nextTurn();
        enemyCar4.nextTurn();

        arrayEnemyCar.addEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
        arrayEnemyCar.addEnemyCar(enemyCar2.getCurrentColumn(), enemyCar2.getCurrentRow());
        arrayEnemyCar.addEnemyCar(enemyCar3.getCurrentColumn(), enemyCar3.getCurrentRow());
        arrayEnemyCar.addEnemyCar(enemyCar4.getCurrentColumn(), enemyCar4.getCurrentRow());
        arrayEnemyCar.addEnemyCar(enemyCar5.getCurrentColumn(), enemyCar5.getCurrentRow());
        arrayEnemyCar.showEnemyCar();


        for (int i = 0; i<8;i++){
            arrayEnemyCar.deleteEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
            arrayEnemyCar.deleteEnemyCar(enemyCar2.getCurrentColumn(), enemyCar2.getCurrentRow());
            arrayEnemyCar.deleteEnemyCar(enemyCar3.getCurrentColumn(), enemyCar3.getCurrentRow());
            arrayEnemyCar.deleteEnemyCar(enemyCar4.getCurrentColumn(), enemyCar4.getCurrentRow());
            arrayEnemyCar.deleteEnemyCar(enemyCar5.getCurrentColumn(), enemyCar5.getCurrentRow());

            enemyCar1.nextTurn();
            enemyCar2.nextTurn();
            enemyCar3.nextTurn();
            enemyCar4.nextTurn();
            enemyCar5.nextTurn();

            arrayEnemyCar.addEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
            arrayEnemyCar.addEnemyCar(enemyCar2.getCurrentColumn(), enemyCar2.getCurrentRow());
            arrayEnemyCar.addEnemyCar(enemyCar3.getCurrentColumn(), enemyCar3.getCurrentRow());
            arrayEnemyCar.addEnemyCar(enemyCar4.getCurrentColumn(), enemyCar4.getCurrentRow());
            arrayEnemyCar.addEnemyCar(enemyCar5.getCurrentColumn(), enemyCar5.getCurrentRow());
            arrayEnemyCar.showEnemyCar();
            System.out.println(myCar.isOver(arrayEnemyCar.getEnemyCar()));
        }
        /*Show.fillEnemyCar(3,0,enemyCar);*/
    }
}
