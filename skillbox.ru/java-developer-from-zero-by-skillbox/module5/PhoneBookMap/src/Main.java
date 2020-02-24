import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main
{
    public static void main( String[] args )
    {
//      - Написать умный эмулятор телефонной книги.
//      Если в неё ввести новое имя, она должна запросить номер телефона.
//      Если в неё ввести новый номер телефона, должна запросить имя.
//      Если введённое имя или номер телефона найдены, должна вывести дополнительную информацию:
//          - номер или имя, соответственно.
//      Команда LIST должна выводить всех абонентов в алфавитном порядке с номерами телефонов.
        
        Scanner scanner = new Scanner( System.in );

        TreeMap<String, String> contacts = new TreeMap<>(){};
        String command;

        Pattern pattern = Pattern.compile( "(?<contactNumber>.\\d+.*)|(?<contactName>[а-яА-Яa-zA-Z]+)" );

        // Основной цикл
        while ( true )
        {
            System.out.println( "Введите номер телефона или имя: " );
            command = scanner.nextLine().trim();

            // Введена команда LIST
            if ( command.equals( "LIST" ) )
            {
                for ( String name : contacts.keySet() ) {
                    System.out.println( "Имя: " + name + "; Телефон: " + contacts.get( name ) );
                }
            }

            // Введен запрос
            else
            {
                Matcher m = pattern.matcher( command );

                if ( m.find() )
                {
//                    System.out.println( "group1: " + m.group("contactNumber") );
//                    System.out.println( "group2: " + m.group("contactName") );
                    // Введен номер телефона
                    if ( m.group("contactNumber") != null )
                    {
                        // Проверяем, есть ли имя у этого контакта
                        if ( contacts.containsValue( command ) )
                        {
                            for(Map.Entry<String, String> entry : contacts.entrySet()) {
                                String key = entry.getKey();
                                String value = entry.getValue();
                                if (value.equals(command) ) {
                                    System.out.println("Имя: " + key );
                                    break;
                                }
                            }

                            if (contacts.containsKey( command ) ) {
                                System.out.println( "Имя: " + contacts.get( command ) );
                            }
                        }

                        // Номер телефона не найден, предложить его вести
                        else
                        {
                            System.out.println( "По этому номеру не найдено контактов. Введите имя, чтобы сохранить в книгу:");
                            String contactName = scanner.nextLine().trim();
                            contacts.put( contactName, command );
                        }
                        continue;
                    }

                    // Введено имя
                    if ( m.group("contactName") != null )
                    {
                        // Проверяем, есть ли номер телефона у этого контакта
                        if ( contacts.containsKey( command ) )
                        {
                            System.out.println( "Телефон: " + contacts.get( command ) );
                        }

                        // Номер телефона не найден, предложить его вести
                        else
                        {
                            System.out.println( "Номер телефона этого контакта не найден. Введите номер, чтобы сохранить в книгу:");
                            String contactPhone = scanner.nextLine().trim();
                            contacts.put( command, contactPhone );
                        }
                        continue;
                    }
                }
            }
        }
    }
}
