public class TechnicalItem extends GenericItem {

    private short warrantyTime; // гарантийный срок товара

    TechnicalItem(int tempId, String tempName, float tempPrice, TechnicalItem tempAnalog, short tempWarrantyTime) {
        super(tempId, tempName, tempPrice, tempAnalog);
        warrantyTime = tempWarrantyTime;
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
        return super.toString() + " ---WarrantyTime: " + warrantyTime + " days";
    }

    public void printAll() {
        System.out.println("*****");
        System.out.println("---ID: " + getId() + " ---Name: " + getName() + " ---Price: " + getPrice() + " ---Analog: "
                + getAnalog().getName() + " ---Category: " + getCategory() + " ---WarrantyTime: " + warrantyTime + " days");
    }
    public short getWarrantyTime() {
        return warrantyTime;
    }
}
