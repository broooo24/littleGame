import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static boolean isRunnable1Stopped = false;
    public static void main(String[] args) {
        //Show.showMyPosition(1);

        String [][] enemyCar = {
                {" "," "," "," ", " "," "},
                {" "," "," "," ", " "," "},
                {" "," "," "," ", " "," "},
                {" "," "," "," ", " "," "},
                {" "," ","x","x", " "," "},
        };
        myCar myCar = new myCar(2);

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                ArrayEnemyCar arrayEnemyCar = new ArrayEnemyCar();
                EnemyCar enemyCar1 = new EnemyCar();
                EnemyCar enemyCar2 = new EnemyCar();
                EnemyCar enemyCar3 = new EnemyCar();
                EnemyCar enemyCar4 = new EnemyCar();
                EnemyCar enemyCar5 = new EnemyCar();


                //System.out.println(enemyCar1);
                arrayEnemyCar.addEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
                arrayEnemyCar.showEnemyCar();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                arrayEnemyCar.deleteEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
                enemyCar1.nextTurn();
                arrayEnemyCar.addEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());

                //System.out.println(enemyCar2);
                arrayEnemyCar.addEnemyCar(enemyCar2.getCurrentColumn(), enemyCar2.getCurrentRow());
                arrayEnemyCar.showEnemyCar();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                arrayEnemyCar.deleteEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
                arrayEnemyCar.deleteEnemyCar(enemyCar2.getCurrentColumn(), enemyCar2.getCurrentRow());

                enemyCar1.nextTurn();
                enemyCar2.nextTurn();

                arrayEnemyCar.addEnemyCar(enemyCar1.getCurrentColumn(), enemyCar1.getCurrentRow());
                arrayEnemyCar.addEnemyCar(enemyCar2.getCurrentColumn(), enemyCar2.getCurrentRow());
                arrayEnemyCar.addEnemyCar(enemyCar3.getCurrentColumn(), enemyCar3.getCurrentRow());
                arrayEnemyCar.showEnemyCar();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
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
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
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
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("hi");

                for (int i = 0; i<100;i++){
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
                    if(myCar.isOver(arrayEnemyCar.getEnemyCar())) {
                        System.out.println("you lost");
                        isRunnable1Stopped=true;
                        break;
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };
        new Thread(runnable1).start();

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                //my car
                for (int i = 0;i<100;i++){
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("");
                    String direction = scanner.nextLine();
                    if (direction.equalsIgnoreCase("R")){
                        myCar.changeColumn("R");
                    }else if(direction.equalsIgnoreCase("L")){
                        myCar.changeColumn("L");
                    }

                    System.out.println(myCar.getCurrentColumn());
                    if (isRunnable1Stopped){
                        break;
                    }

                }
            }
        };

        new Thread(runnable2).start();
        /*Show.fillEnemyCar(3,0,enemyCar);*/
    }
}
