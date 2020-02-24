import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main( String[] args ) throws IOException {

        System.out.println("Введите номер телефона в любом формате:");
        String phone = new BufferedReader( new InputStreamReader( System.in )).readLine().trim();
        // Фильтрация
        phone = phone.replaceAll("[^0-9]+", "");
        System.out.println("Отфильтрованный номер: " + phone);
    }
}
