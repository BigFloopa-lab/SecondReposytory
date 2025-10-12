
public class Main {
    public static void main(String[] args) {
        System.out.println("---1 task---");
        int[] inputArray1 = {100, 543, 632, 867, 345};
        int max = inputArray1[0];
        int min = inputArray1[0];
        int sum = 0;

        for (int value : inputArray1) {
            sum += value;
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        double average = (double) sum / inputArray1.length;

        double[] outputArray1 = {sum, max, min, average};

        System.out.print("inputArray1: ");
        for (int val : inputArray1) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("outputArray1: ");
        for (double val : outputArray1) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("---2 task---");
        int[] inputArray2 = {241, 443, 732, 581, 869};
        double taxes = 0.13;
        double[] outputArray2 = new double[inputArray2.length];

        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * taxes;
        }

        System.out.print("inputArray2: ");
        for (int value : inputArray2) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("outputArray2: ");
        for (double value : outputArray2) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("---3 task---");
        int[] inputArray3 = {2410, 4430, 7320, 5810, 8690};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int threshold = 5000;

        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > threshold;
        }

        System.out.print("inputArray3: ");
        for (int val : inputArray3) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("outputArray3: ");
        for (boolean flag : outputArray3) {
            System.out.print(flag + " ");
        }
        System.out.println();

        System.out.println("---4 task---");
        int[] inputArray4 = {10512, 52430, 23270, 2240, 12450};
        boolean outputArray4;

        outputArray4 = true;
        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4 = false;
                break;
            }
        }

        System.out.print("inputArray4: ");
        for (int val : inputArray4) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("outputArray4: " + outputArray4);

        System.out.println("---5 task---");
        int[] inputArray5 = {102512, 532430, -23465, 276240, 766450};
        int count = 0;

        for (int netProfit : inputArray5) {
            if (netProfit > 0) {
                count++;
            }
        }

        System.out.print("inputArray5: ");
        for (int sec : inputArray5) {
            System.out.print(sec + " ");
        }
        System.out.println();
        System.out.println("outputArray5: " + count);

    }
}


