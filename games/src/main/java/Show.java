import java.util.Arrays;

public class Show {
    public static void showMyPosition(int number){
        System.out.println("------");
        System.out.println("      ");
        System.out.println("      ");
        System.out.println("      ");
        System.out.println("      ");
        System.out.println("      ");
        System.out.println("------");
        if (number == 0){
            System.out.println("x     ");
        }else if(number == 1){
            System.out.println(" x");
        }else if(number == 2){
            System.out.println("  x");
        }else if(number == 3){
            System.out.println("   x");
        }else if(number == 4){
            System.out.println("    x");
        }else if(number == 5){
            System.out.println("     x");
        }
    }

    public static void fillEnemyCar(int rowNumber,int columnNumber , String[][] enemyCar){
        enemyCar[columnNumber][rowNumber] = "x";
        System.out.println(Arrays.deepToString(enemyCar));
    }

}
