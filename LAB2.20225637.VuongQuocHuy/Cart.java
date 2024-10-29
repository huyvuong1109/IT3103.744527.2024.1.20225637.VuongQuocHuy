public class Cart{
    public static final int MAX_NUMBERS_ODERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ODERED];
    private int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered < 20){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } 
        else {
            System.out.println("The cart is almost full");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int index = 0; index < qtyOrdered; index++){
            if(itemsOrdered[index].getTitle() == disc.getTitle()){
                for(int j = index; j < qtyOrdered;j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered--;
                System.out.println("The disc has been removed");
                break;
            }
        } 
    }
    public float totalCost(){
        float total = 0;
        for(int index = 0; index < qtyOrdered; index++){
            total += itemsOrdered[index].getCost();
        }
        return total;
    }
}
