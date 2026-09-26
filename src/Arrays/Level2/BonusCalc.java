package Arrays.Level2;
import java.util.Scanner;
 public class BonusCalc {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double[] sal = new double[10], yrs = new double[10], bonus = new double[10], newSal = new double[10];
            double totBonus = 0, totOld = 0, totNew = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Salary: ");
                double s = sc.nextDouble();
                System.out.print("Years: ");
                double y = sc.nextDouble();
                if (s <= 0 || y < 0) { System.out.println("Invalid!"); i--; continue; }
                sal[i] = s; yrs[i] = y;
            }

            for (int i = 0; i < 10; i++) {
                bonus[i] = sal[i] * (yrs[i] > 5 ? 0.05 : 0.02);
                newSal[i] = sal[i] + bonus[i];
                totBonus += bonus[i]; totOld += sal[i]; totNew += newSal[i];
                System.out.println("Emp" + (i+1) + " Old=" + sal[i] + " Bonus=" + bonus[i] + " New=" + newSal[i]);
            }

            System.out.println("Total Bonus=" + totBonus);
            System.out.println("Total Old Salary=" + totOld);
            System.out.println("Total New Salary=" + totNew);
        }
    }

