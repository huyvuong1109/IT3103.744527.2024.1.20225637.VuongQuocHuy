public class Store {
    public static final int MAX_NUMBERS_DVD = 100;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_DVD];
    private int qtyOrdered = 0;

    public int getQtyOrdered(){
        return qtyOrdered;        
    }

    public void setQtyOrdered(int n){
        qtyOrdered += n;
    }
    public void addDVD(DigitalVideoDisc disc){
        if(this.getQtyOrdered() != 100) {
            itemsInStore[this.getQtyOrdered()] = disc;
            setQtyOrdered(1);
            System.out.println(" The disc has been added in the hust.dsai.aims.store.Store");

        }
    }
     public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsInStore[i].getCost(); 
        }
        return total;
    }
    public void removeDVD(DigitalVideoDisc disc){
        for(int i = 0; i < qtyOrdered; i++){
            if(itemsInStore[i].getTitle() == disc.getTitle()){
                for(int j = i; j < qtyOrdered; j++){
                    itemsInStore[j] = itemsInStore[j+1];
                } i--;
                setQtyOrdered(-1);
                System.out.println(" The disc has been removed in the hust.dsai.aims.store.Store");
            }
        }
    }
} 