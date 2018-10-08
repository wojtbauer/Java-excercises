import java.util.Scanner;

public class businessCard {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//system.in - standardowe wejscie
				
		System.out.println("First Name: ");
		String imie = scanner.next();
		
		System.out.println("Last Name: ");
		String Nazwisko = scanner.next();
		
		System.out.println("Phone Number: ");
		int tel = scanner.nextInt();
		
		System.out.println("City: ");
		String miasto = scanner.next();
        
        String firstLine = "* " + imie + " " + Nazwisko;
		String lastLine = "* tel. " + tel + " " + miasto;
		

		int firstLineLength = firstLine.length();
		int lastLineLength = lastLine.length();
            
        int longestLineLength;
        
        if(firstLine.length() > lastLine.length()) {
            longestLineLength = firstLine.length();}
        else
        {
            longestLineLength= lastLine.length();
        }

		String stars = "";
		for (int star = 0; star < longestLineLength +2; star++) {
			stars = stars + "*";}
		
        int spaceFirst = longestLineLength - firstLineLength;
        int spaceLast = longestLineLength - lastLineLength;
        
        String spaces = "";
        for (int space = 0; space < spaceFirst; space++) {
            spaces = spaces + " ";}

        String spacesLast = "";
        for (int space = 0; space < spaceLast; space++) {
            spacesLast = spacesLast + " ";}
        
        String sign = " *";
        
		System.out.println(stars);
		System.out.println(firstLine + spaces  + sign);
		System.out.println(lastLine + spacesLast + sign);
		System.out.println(stars);
		
	}
}

/*
Sposob 2
longestlinelength = line1.length() > line2.length() ? line1.length() : line2.length();

Sposob3:
longestLinieLength = Math.max(line1.length(), line2.length());
*/
