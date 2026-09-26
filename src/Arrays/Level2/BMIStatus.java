package Arrays.Level2;
import java.util.Scanner;
    public class BMIStatus {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of persons: ");
            int n = sc.nextInt();
            double[][] data = new double[n][3];
            String[] status = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Weight: ");
                double w = sc.nextDouble();
                System.out.print("Height: ");
                double h = sc.nextDouble();
                if (w <= 0 || h <= 0) { System.out.println("Invalid!"); i--; continue; }
                double bmi = w / (h * h);
                data[i][0] = w; data[i][1] = h; data[i][2] = bmi;
                status[i] = bmi < 18.5 ? "Underweight" :
                        bmi < 25 ? "Normal" :
                                bmi < 30 ? "Overweight" : "Obese";
            }
            for (int i = 0; i < n; i++) {
                System.out.println("Person" + (i+1) +
                        " W=" + data[i][0] +
                        " H=" + data[i][1] +
                        " BMI=" + data[i][2] +
                        " Status=" + status[i]);
            }
        }
    }

