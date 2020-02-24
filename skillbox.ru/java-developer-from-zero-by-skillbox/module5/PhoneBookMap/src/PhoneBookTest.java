import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBookTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner( System.in );
        Pattern pattern = Pattern.compile( "(?<contactNumber>\\d+)|(?<contactName>[а-яА-Яa-zA-Z]+)" );

        PhoneBook phoneBook = new PhoneBook();

        // Main loop
        while ( true ) {
            System.out.println( "Введите номер телефона или имя: " );
            String command = scanner.nextLine().trim();

            // command: LIST
            if ( command.equals( "LIST" )) {
                phoneBook.showContactList();
            }

            // request
            else
            {
                Matcher m = pattern.matcher( command );

                if ( m.find() ) {
//                    System.out.println( "group1: " + m.group("contactNumber") );
//                    System.out.println( "group2: " + m.group("contactName") );

                    // request: phone number
                    if ( m.group("contactNumber") != null ) {
                        if ( phoneBook.isContactNameExists( command )) {
                            phoneBook.showContactNameByNumber( command );
                        } else {
                            System.out.println( "По этому номеру не найдено контактов. Введите имя, чтобы сохранить в книгу:");
                            String contactName = scanner.nextLine().trim();

                            m = pattern.matcher( contactName );
                            if ( m.find() && m.group("contactName") != null && m.group("contactNumber") == null ) {
                                phoneBook.addNewContact(m.group("contactName"), command);
                            } else {
                                System.out.println( "Ошибка! Имя должно начинаться с буквы!");
                            }
                        }
                        continue;
                    }

                    // request contact name
                    if ( m.group("contactName") != null )
                    {
                        if ( phoneBook.isContactNumberExists( command )) {
                            phoneBook.showContactNumberByName( command );
                        }

                        // phone number is not found
                        else
                        {
                            System.out.println( "Номер телефона этого контакта не найден. Введите номер, чтобы сохранить в книгу:");
                            String contactNumber = scanner.nextLine().trim();

                            m = pattern.matcher( contactNumber );
                            if ( m.find() && m.group("contactName") == null && m.group("contactNumber") != null ) {
                                phoneBook.addNewContact( command, m.group("contactNumber") );
                            } else {
                                System.out.println( "Ошибка! Ожидался ввод номера телефона");
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }
}
