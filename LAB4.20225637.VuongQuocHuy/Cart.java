import java.util.List;
import java.util.ArrayList;
public class Cart{
    public static final int MAX_NUMBERS_ODERED = 20;
    private List<Media> itemsOrdered = new ArrayList<>();
    private int qtyOrdered = 0;
    
    //public void addDigitalVideoDisc(DigitalVideoDisc disc){
    //    if(qtyOrdered < 20){
    //        itemsOrdered[qtyOrdered] = disc;
      //     qtyOrdered++;
    //        System.out.println("The disc has been added");
    //    } 
    //    else {
    //        System.out.println("The cart is almost full");
    //    }
   // }
   // public void removeDigitalVideoDisc(DigitalVideoDisc disc){
   //     for(int index = 0; index < qtyOrdered; index++){
   //     if(itemsOrdered[index].getTitle() == disc.getTitle()){
   //             for(int j = index; j < qtyOrdered;j++){
   //                 itemsOrdered[j] = itemsOrdered[j+1];
   //             }
   //             qtyOrdered--;
   //             System.out.println("The disc has been removed");
   //             break;
   //         }
   //     } 
  // }
   public boolean addMedia(Media media){
    if(itemsOrdered.size() == MAX_NUMBERS_ODERED){
        System.out.println("The cart is already full");
        return false;
    }
    else{
        itemsOrdered.add(media);
        System.out.println("Item added");
        return true;
    }
   }
   public boolean removeMedia( Media media){
    if(!itemsOrdered.contains(media)){
        System.out.println("No such item found");
        return false;
    } else{
        itemsOrdered.remove(media);
        System.out.println("Item removed");
        return true;
    }
   }
   public float totalCost(){
    float sum = 0f;
    for(Media item : itemsOrdered){
        sum += item.getCost();
    } return sum;
   }
   // public float totalCost(){
   //     float total = 0;
   //     for(int index = 0; index < qtyOrdered; index++){
   //         total += itemsOrdered[index].getCost();
    //    }
    //    return total;
   // }
  //  public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
  //      for (DigitalVideoDisc disc : dvdList){
  //          addDigitalVideoDisc(disc);
  //      } 
  //      System.out.println("DVDs have been added to the cart.");

  //  }
  //  public void addDigitalVideoDisc1(DigitalVideoDisc... dvdList){
  //      for (DigitalVideoDisc disc : dvdList){
  //          this.addDigitalVideoDisc(disc);
  //      } 
  //      System.out.println("DVDs have been added to the cart.");

   // }
   // public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
   //     addDigitalVideoDisc(dvd1);
   //     addDigitalVideoDisc(dvd2);
   // }
    
   
    //public void listID(){
    //    for(int i = 1; i <= qtyOrdered; i++)
    //    System.out.println("ID: " + itemsOrdered[i].getId() + " - " +
    //     itemsOrdered[i].getTitle());
    //    }
   // public void printCart(){
   //     System.out.println("*******************CART**************");
   //     System.out.println("Ordered Items:");

  //      for(int i=0; i < qtyOrdered; i++){
   //         DigitalVideoDisc dvd = itemsOrdered[i];
  //          System.out.printf("%d.DVD - %s - %s - %s - %d minutes: %.2f $\n", i +1, dvd.getTitle(),
  //          dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost());
   //     }
   //     float totalCost = totalCost();
   //     System.out.printf("Total cost: %.2f $\n", totalCost);
   //     System.out.println("*********************************************");
  //  }
  //  public boolean search(int id){
  //      int n = qtyOrdered;
  //      for(int i = 0; i<n;i++){
   //         if(itemsOrdered[i].getId() == id){
   //             return true;
   //         }
   //     } return false;

  //  }
  //  public boolean search(String title){
    //    int n = qtyOrdered;
      //  for(int i = 0; i<n;i++){
        //    if(itemsOrdered[i].getTitle()==title){
          //      return true;
     //       }
     //   } return false;

 //   }

}
