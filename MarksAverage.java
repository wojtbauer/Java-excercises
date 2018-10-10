import java.util.Scanner;
import java.util.Arrays;

public class MarksAverage {

	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
           
            System.out.println("Amount of marks: ");
            int marksAmount = scanner.nextInt();
            
            double[] tab = new double[marksAmount];

            System.out.println("Introduce marks: ");
            for (int i = 0; i < tab.length; i++) {
                tab[i] = scanner.nextDouble(); }
     
            //System.out.print("Introduced marks: ");
            //System.out.println(Arrays.toString(tab));
            
            double result = average(tab);
            System.out.print("Marks average: ");
            System.out.println(result);
            
            double maximum = max(tab);
            System.out.print("Max mark: ");
            System.out.println(maximum);

    }   

	public static double average(double[] tab) {
            double sum = 0;

            for(int i=0; i<tab.length; i++) {
                sum += tab[i]; }
                
            return sum/tab.length;
    }
    
	public static double max(double[] tab) {
            double maxVal = tab[0];
            
            for (int i = 1; i < tab.length; i++)
            {
                 if (tab[i] > maxVal)
                 {
                  maxVal = tab[i];
                 }
            }
            return maxVal;

    }

 
}
