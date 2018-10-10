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
            tab[i] = scanner.nextDouble();}
        
        double result = average(tab);
        System.out.print("Marks average: ");
        System.out.println(result);
        }   
        
        //System.out.print("Introduced marks: ");
        //System.out.println(Arrays.toString(tab));
        
	public static double average(double[] tab) {
            double sum = 0;

            for(int i=0; i<tab.length; i++) {
                sum += tab[i];}
                
            return sum/tab.length;
    }


 
}
