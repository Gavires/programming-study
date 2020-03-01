import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Как Вас зовут?");
        name = scanner.nextLine();
        System.out.format( "Здравствуйте, %s!", name);
    }
}
