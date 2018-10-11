public class LoginGenerator {

    public static void main(String[] args) {
        
        String domain = "@student.agh.edu.pl";
        
        String[] studentNames = { "Budynek Piotr", 
                                  "Chalupa Krystyna", 
                                  "Wiezowiec Jan",
                                  "Szkieletor Andrzej",
                                  "Domek Marianna",};
                                  
        for(int i=0; i<studentNames.length; i++){
           String names = studentNames[i];
           String part1Names = names.substring(0,2);
           String lower1 = part1Names.toLowerCase();
           String[] wynik = names.split(" ");
           
            for(int j=1; j < wynik.length; j++) {
               String sure = wynik[1];
               String part2Names = sure.substring(0,3);
               String lower2 = part2Names.toLowerCase();
              
           System.out.println(lower2 + lower1 + domain);}
        }
    }
}

