import java.util.List;
import java.util.ArrayList;
public class Store {
    public static final int MAX_NUMBERS_DVD = 100;
    private List<Media> itemsInStore = new ArrayList<>();
 //   private int qtyOrdered = 0;

     public boolean addMedia(Media media){
    if(itemsInStore.size() == MAX_NUMBERS_DVD){
        System.out.println("Store is already full");
        return false;
    }
    else{
        itemsInStore.add(media);
        System.out.println("Item added successfully");
        return true;
    }
   }
   public boolean removeMedia( Media media){
    if(!itemsInStore.contains(media)){
        System.out.println("Item not found");
        return false;
    } else{
        itemsInStore.remove(media);
        System.out.println("Item removed successfully");
        return true;
    }
   }
   public boolean removeMedia(String title){
    for(Media item : itemsInStore){
        if(item.getTitle().equals(title)){
            itemsInStore.remove(item);
            System.out.println("Item removed");
            return true;
        }
    }
    System.out.println("item not found");
    return false;
   }
 //   public int getQtyOrdered(){
 //       return qtyOrdered;        
 //   }

 //   public void setQtyOrdered(int n){
 //       qtyOrdered += n;
 //   }
 //   public void addDVD(DigitalVideoDisc disc){
 //       if(this.getQtyOrdered() != 100) {
 //           itemsInStore[this.getQtyOrdered()] = disc;
 //           setQtyOrdered(1);
 //           System.out.println(" The disc has been added in the hust.dsai.aims.store.Store");

 //       }
 //   }
 //    public float totalCost() {
 //       float total = 0;
 //       for (int i = 0; i < qtyOrdered; i++) {
 //           total += itemsInStore[i].getCost(); 
 //       }
 //       return total;
 //   }
 //   public void removeDVD(DigitalVideoDisc disc){
 //       for(int i = 0; i < qtyOrdered; i++){
 //           if(itemsInStore[i].getTitle() == disc.getTitle()){
 //               for(int j = i; j < qtyOrdered; j++){
 //                   itemsInStore[j] = itemsInStore[j+1];
  //              } i--;
  //              setQtyOrdered(-1);
  //              System.out.println(" The disc has been removed in the hust.dsai.aims.store.Store");
  //          }
   //     }
  //  }
} 