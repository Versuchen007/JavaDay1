import java.util.Scanner;

public class JavaDay2 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        // Hoi ten

        System.out.print("What is you name: ");

          // Hoi tuoi

         String name = scanner.nextLine();
        System.out.print("How old are you: ");

        // Hoi so thich

         int old = Integer.parseInt(scanner.nextLine());
        System.out.print("What are your game favourite: ");
         String game = scanner.nextLine();

        // Hoi elo

        System.out.print("How much ur elo: ");
         Double elo = scanner.nextDouble();
        System.out.println("Wow " + name + " , " + old + " age play " + game + " with elo " + elo  );

        // Hoi dung sai

        System.out.print("Mày co dep trai ko?(true/false): ");
         boolean isDonk = scanner.nextBoolean();

        if(isDonk){
            System.out.println("dep trai ma ngu");
        }
        else{
            System.out.println("6");
        }

        // tinh dien tich

        System.out.print("high: ");
         double high = scanner.nextDouble();
        System.out.print("width: ");
         double width = scanner.nextDouble();
         double area = 0;
        area = high * width;
        System.out.print("it is " + area);
    
        scanner.close();
 }
}