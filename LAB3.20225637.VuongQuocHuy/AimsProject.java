public class AimsProject{
    public static void main(String[] args){
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
       anOrder.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Venom","Science Fiction",28.99f);
        anOrder.addDigitalVideoDisc(dvd4);

       // anOrder.removeDigitalVideoDisc(dvd2);
      // anOrder.addDigitalVideoDisc1(dvd1, dvd2, dvd3, dvd4);
      //  DigitalVideoDisc[] discList = {dvd1, dvd3};
       // anOrder.addDigitalVideoDisc(discList);
       //anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        

        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        anOrder.listID();

    }
}
