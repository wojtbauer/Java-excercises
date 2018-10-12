import java.util.Scanner;

public class Dividers {
    
	public static void main(String[] args) {
        System.out.println("A:");
        int a = readNumber();
        //System.out.println("B:");
        //int b = readNumber();
        //checkDivider(a, b);   
        System.out.println();
        int [] divisors = Dividers.findDividers(a);
        for (int i : divisors){
            if(i == 0) continue;
            System.out.println(i);}        
        
    }    

 	public static int readNumber() {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Introduce natural number: ");
        int naturalNumber = scanner.nextInt(); 
        return naturalNumber;   
    }       
    
 	//public static void checkDivider(int a, int b) {
        //int check = a % b;
        //if (check == 0)
        //{
            //System.out.println("Jest podzielnikiem");
        //}
        //else
        //{
            //System.out.println("Nie jest dzielnikiem!");
        //}
    //}

    public static int [] findDividers(int x){
        int [] divisors = new int[x/2];
        int j = 0;
        for(int i=1; i<= x/2 ; i++)
        {
            if (x % i == 0){ 
                divisors[j] = i; 
                j++;}
        }
        return divisors;
    }
 	//public static int[] findDividers(int[] dividers){
        //Scanner scanner = new Scanner(System.in);

        //int x = scanner.nextInt();
        //for(int j=1; j<= x/2 ; j++) 
            //{
               //if(x % j == 0) 
                //{
                    //dividers[j] = j;
                //}
                
            //}
            //return dividers;
        
        //}

}
//https://pastebin.com/M7NbeBys
