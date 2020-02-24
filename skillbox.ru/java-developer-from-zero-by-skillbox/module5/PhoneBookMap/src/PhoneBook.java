import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private TreeMap <String, String> contacts = new TreeMap<>();

    public boolean isContactNameExists( String contactName ) {
        return contacts.containsValue( contactName );
    }
    public boolean isContactNumberExists( String contactNumber ) {
        return contacts.containsKey( contactNumber );
    }

    public void showContactNameByNumber( String number ) {
        for( Map.Entry <String, String> entry : contacts.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ( value.equals( number )) {
                System.out.printf( "Имя: %s\n", key);
                break;
            }
        }
    }

    public void showContactNumberByName( String name ) {
        System.out.printf( "Телефон: %s\n", contacts.get( name ));
    }

    public void showContactList () {
        for ( String name : contacts.keySet() ) {
            System.out.printf("Имя: %s; Телефон: %s\n", name, contacts.get( name ));
        }
    }

    public void addNewContact( String contactName, String contactNumber ) {
        contacts.put( contactName, contactNumber );
    }
}
