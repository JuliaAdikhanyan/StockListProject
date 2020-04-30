
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        GenericItem item1 = new GenericItem(606, "book", 70.70f,  null, Category.PRINT);

        GenericItem item2 = new GenericItem(666, "newBook", 220.20f, item1, Category.PRINT); // экземпляр класса

        item1.setAnalog(item2); // добавляем аналог

        GenericItem item3 = new GenericItem(999, "dress", 8080.80f, null, Category.DRESS); // экземпляр класса

        GenericItem item4 = new GenericItem(909, "newDress", 2000.00f, item3, Category.DRESS); // экземпляр класса

        item3.setAnalog(item4);

        GenericItem item5 = new GenericItem(555, "glass", 110.10f, null); // экземпляр класса

        GenericItem item6 = new GenericItem(505, "newGlass", 330.30f, item5); // экземпляр класса

        item5.setAnalog(item6);

        FoodItem item7 = new FoodItem(333, "milk", 50.50f, null, Category.FOOD,
                new GregorianCalendar(2020, Calendar.APRIL, 1), (short) 30); // экземпляр класса

        FoodItem item8 = new FoodItem(303, "newMilk", 150.50f, item7, Category.FOOD,
                new GregorianCalendar(2020, Calendar.APRIL, 30), (short) 50); // экземпляр класса

        item7.setAnalog(item8);

        TechnicalItem item9 = new TechnicalItem(1111, "phone", 3330.30f, null, (short) 365);

        TechnicalItem item10 = new TechnicalItem(1001, "newPhone", 30000.00f, item9, (short) 365);

        item9.setAnalog(item10);

        item1.printAll(); // выводим
        item2.printAll();
        item3.printAll();
        item4.printAll();
        item5.printAll();
        item6.printAll();

        System.out.println("*****");
        System.out.println("Object are equals: " + item7.equals(item8)); // сравниваем объекты

        GenericItem[] items = new GenericItem[] {item7, item8, item9, item10}; // добавляем в массив
        for (GenericItem tempItem : items) {
            tempItem.printAll();
        }

        FoodItem cloneFood = (FoodItem) item7.clone(); // клонируем item7

        System.out.println();
        System.out.println("Clone item7: ");
        cloneFood.printAll();

        System.out.println("*****");
        System.out.println("Object and clone are equal: " + item7.equals(cloneFood));

        System.out.println("*****");
        System.out.println(item1.toString()); // преобразовываем в String

        System.out.println("*****");
        System.out.println(item4.toString());

        System.out.println("*****");
        System.out.println(item7.toString());

        GenericItem cloneAnalog = item1.cloneAnalog(); // клонируем аналог

        System.out.println();
        System.out.println("Clone Analog item: ");
        cloneAnalog.printAll();
    }
}
