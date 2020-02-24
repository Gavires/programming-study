public class Loader
{
    public static void main(String[] args)
    {
        int milkAmount = 700; // ml
        int powderAmount = 355; // g
        int eggsCount = 30; // items
        int sugarAmount = 100; // g
        int oilAmount = 50; // ml
        int appleCount = 5;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        System.out.println("Pancakes");
        if(powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30){
            System.out.println("Вы можете приготовить блины");
        }
        else{
            System.out.println("Вы не можете приготовить блины");
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
        System.out.println("Omelette");
        if(milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5){
            System.out.println("Вы можете приготовить омлет");
        }
        else{
            System.out.println("Вы не можете приготовить омлет");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        System.out.println("Apple pie");
        if(appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4){
            System.out.println("Вы можете приготовить яблочный пирог");
        }
        else{
            System.out.println("Вы не можете приготовить яблочный пирог");
        }
    }
}