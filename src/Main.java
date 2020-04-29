import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        GenericItem Item1 = new GenericItem(606, "book", 70.70f,  null, Category.PRINT);

        GenericItem Item2 = new GenericItem(666, "newBook", 220.20f, Item1, Category.PRINT); // экземпляр класса

        Item1.setAnalog(Item2);

        GenericItem Item3 = new GenericItem(999, "dress", 8080.80f, null, Category.DRESS); // экземпляр класса

        GenericItem Item4 = new GenericItem(909, "newDress", 2000.00f, Item3, Category.DRESS); // экземпляр класса

        Item3.setAnalog(Item4);

        GenericItem Item5 = new GenericItem(555, "glass", 110.10f, null); // экземпляр класса

        GenericItem Item6 = new GenericItem(505, "newGlass", 330.30f, Item5); // экземпляр класса

        Item5.setAnalog(Item6);

        FoodItem Item7 = new FoodItem(333, "milk", 50.50f, null, Category.FOOD,
                new GregorianCalendar(2020, Calendar.APRIL, 1), (short) 30); // экземпляр класса

        FoodItem Item8 = new FoodItem(303, "newMilk", 150.50f, Item7, Category.FOOD,
                new GregorianCalendar(2020, Calendar.APRIL, 30), (short) 50); // экземпляр класса

        Item7.setAnalog(Item8);

        TechnicalItem Item9 = new TechnicalItem(1111, "phone", 3330.30f, null, (short) 365);

        TechnicalItem Item10 = new TechnicalItem(1001, "newPhone", 30000.00f, Item9, (short) 365);

        Item9.setAnalog(Item10);

        Item1.printAll();
        Item2.printAll();
        Item3.printAll();
        Item4.printAll();
        Item5.printAll();
        Item6.printAll();

        System.out.println("*****");
        System.out.println("Object are equals: " + Item7.equals(Item8));

        GenericItem[] Items = new GenericItem[] {Item7, Item8, Item9, Item10};
        for (GenericItem tempItem : Items) {
            tempItem.printAll();
        }

        FoodItem cloneFood = (FoodItem) Item7.clone();

        System.out.println();
        System.out.println("Clone Item7: ");
        cloneFood.printAll();

        System.out.println("*****");
        System.out.println("Object and clone are equal: " + Item7.equals(cloneFood));

        System.out.println("*****");
        System.out.println(Item1.toString());

        System.out.println("*****");
        System.out.println(Item4.toString());

        System.out.println("*****");
        System.out.println(Item7.toString());

        GenericItem cloneAnalog = Item1.cloneAnalog();

        System.out.println();
        System.out.println("Clone Analog Item1: ");
        cloneAnalog.printAll();
    }
}