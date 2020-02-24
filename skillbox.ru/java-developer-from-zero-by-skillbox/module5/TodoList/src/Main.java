import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main( String[] args )
    {

//        Разработать список дел, которым можно управлять командами в консоли.
//        Команды LIST, ADD, EDIT, DELETE.
//        LIST должен выводить дела с их порядковыми номерами.
//        ADD - добавлять дело в конец списка или дело на определённое место,
//        сдвигая остальные дела вперёд, если указать номер.
//        EDIT - заменять дело с указанным номером.
//        DELETE - удалять.

        // Регулярное выражение
        // https://regex101.com/r/dXd3uk/6

        ArrayList<String> todoList = new ArrayList<>(){};
        Pattern pattern = Pattern.compile( "^(LIST|ADD|DELETE|EDIT)\\s?(\\d+)?\\s?([а-яА-Яa-zA-Z0-9].+){0,1}" );
        Scanner scanner = new Scanner( System.in );
        String commandConsole;

        // Основной цикл
        while ( true )
        {
            System.out.println( "Введите команду:" );
            commandConsole = scanner.nextLine();

            Matcher m = pattern.matcher( commandConsole );

            // Обработка команды
            if ( m.find() )
            {
                String command = m.group(1);
                String commandIndex = m.group(2);
                String commandText = m.group(3);

//                System.out.println( "group1: " + command );
//                System.out.println( "group2: " + commandIndex );
//                System.out.println( "group3: " + commandText );

                // -----------------------------------------------------------------------------------------------------
                if ( command.equals( "LIST")  && commandIndex == null && commandText == null )
                {
                    if ( todoList.size() > 0 ) {
                        System.out.println( "Список дел:" );
                        for ( int i = 0; i < todoList.size(); i++ ) {
                            System.out.println( i + " - " + todoList.get(i) );
                        }
                    }
                    else {
                        System.out.println( "Список дел пуст" );
                    }
                    continue;
                }

                // -----------------------------------------------------------------------------------------------------

                if ( command.equals( "ADD" ) )
                {
                    int indexTodo = todoList.size();
                    // Проверяем указан ли индекс (номер) дела
                    if ( commandIndex != null ) {
                        indexTodo = parseIndex( m, todoList.size() );
                    }
                    todoList.add ( indexTodo == todoList.size() - 1 ? todoList.size() : indexTodo, commandText);
                    continue;
                }
                // -----------------------------------------------------------------------------------------------------
                if ( todoList.size() > 0 && command.trim().equals( "EDIT" ) && commandIndex != null && commandText != null )
                {
                    int indexTodo = todoList.size();
                    // Указан индекс вне списка
                    if ( Integer.parseInt( commandIndex ) > todoList.size() - 1 ) {
                        System.out.println( false );
                    }
                    else {
                        indexTodo = parseIndex( m, todoList.size() );
                        todoList.set(indexTodo, commandText);
                    }
                    continue;
                }
                // -----------------------------------------------------------------------------------------------------
                if ( todoList.size() > 0 && command.equals( "DELETE" ) && commandIndex != null && commandText == null  ) {
                    int indexTodo = todoList.size();
                    // Указан индекс вне списка
                    if (Integer.parseInt(commandIndex) > todoList.size() - 1) {
                        System.out.println("Дела с таким порядковым номером нет в списке!");
                    } else {
                        indexTodo = parseIndex(m, todoList.size());
                        System.out.println("Удалено дело: " + indexTodo + " - " + todoList.remove(indexTodo));
                    }
                    continue;
                }
            }
            System.out.println( "Неизвестная команда");
        }
    }

    // Проверка индекса команды на допустимое значение
    private static int parseIndex(Matcher m, int arraySize)
    {
        int indexTodo = arraySize == 0 ? arraySize : arraySize - 1;

        // commandIndex
        if ( m.group(2) != null )
        {
            indexTodo = Integer.parseInt( m.group(2).trim() );

            if ( indexTodo >= arraySize ) {
                indexTodo = arraySize == 0 ? arraySize : arraySize - 1;
            }
        }
        return indexTodo;
    }
}
