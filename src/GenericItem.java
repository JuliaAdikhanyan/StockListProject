public class GenericItem implements Cloneable {
    private int id; // ID товара
    private String name; // наименование товара
    private float price; // цена товара
    private GenericItem analog; // аналог товара по id
    private Category category = Category.GENERAL; // категория товара // GENERAL - по умолчанию

    GenericItem(int tempId, String tempName, float tempPrice,  GenericItem tempAnalog) { // товары с категорией по умолчанию
        id = tempId;
        name = tempName;
        price = tempPrice;
        analog = tempAnalog;
    }

    GenericItem(int tempId, String tempName, float tempPrice, GenericItem tempAnalog, Category tempCategory) { // товары с указанием категории
        id = tempId;
        name = tempName;
        price = tempPrice;
        analog = tempAnalog;
        category = tempCategory;
    }
    public boolean equals(Object o) {
        GenericItem Item = (GenericItem) o;
        return (this.id == ((GenericItem) o).id);
    }

    public GenericItem clone() {
        try {
            return (GenericItem)super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }

    public GenericItem cloneAnalog() {
            return getAnalog().clone();
    }

    public String toString() {
        return "---ID: " + id + " ---Name: " + name + " ---Price: " + price + " ---Analog: " + analog.name + " ---Category: " + category +
                " " + " ---HashCode: " + this.hashCode();
    }


    public int getId() {
        return id;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void printAll() { // метод для вывода информации
        System.out.println("*****");
        System.out.println("---ID: " + id + " ---Name: " + name + " ---Price: " + price + " ---Analog: " + analog.name + " ---Category: " + category);
    }

    public Category getCategory() {
        return category;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }
}
