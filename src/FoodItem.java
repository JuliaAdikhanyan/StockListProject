import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class FoodItem extends GenericItem { // наследуем класс FoodItem от класса GenericItem

    private short expires; // срок годности
    private GregorianCalendar dateOfIncome; // дата производства через Календарь

    SimpleDateFormat dateFormat = new SimpleDateFormat(" dd MMMM yyyy");

    FoodItem(int tempId, String tempName, float tempPrice, FoodItem tempAnalog, Category tempCategory, GregorianCalendar tempDateOfIncome, short tempExpires) {
        super(tempId, tempName, tempPrice, tempAnalog, tempCategory);
        dateOfIncome = tempDateOfIncome;
        expires = tempExpires;
    }

    public short getExpires() {
        return expires;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public GenericItem clone() {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + " ---DateOfIncome: " + dateFormat.format(dateOfIncome.getTime()) + " ---Expires: " + expires + " days";
    }

    public void printAll() {
        System.out.println("*****");
        System.out.println("---ID: " + getId() + " ---Name: " + getName() + " ---Price: " + getPrice() + " ---Analog: "
                + getAnalog().getName() + " ---Category: " + getCategory() + " ---DateOfIncome: " + dateFormat.format(dateOfIncome.getTime()) + " ---Expires: " + expires + " days");
    }

    public GregorianCalendar getDateOfIncome() {
        return dateOfIncome;
    }
}
