import java.time.Month;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("---1 task---");
        int[] fir = new int[]{1, 2, 3};
        double[] sec = {1.57, 7.654, 9.986};
        float[] drei = new float[3];
        drei[0] = 1.5f;
        drei[1] = 2.8f;
        drei[2] = 3.2f;

        System.out.println("---2 task---");
        for (int index = 0; index < drei.length; index++) {
            if (index == drei.length) {
                System.out.println(drei[index]);
                break;
            }
            System.out.print(drei[index] + ", ");
        }

        System.out.println("---3 task---");
        for (int i = drei.length -1; i >=0; i--){
            System.out.print(drei[i]);
            if (i >0){
                System.out.print(", ");
            }
        }
        System.out.println("---4 task---");
        for (int a = 0; a < fir.length; a++){
            if (fir[a] % 2 != 0){
                fir[a] = fir[a] + 1;

            }

        }System.out.println(Arrays.toString(fir));



    }
}







