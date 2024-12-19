


import java.util.ArrayList;
import java.util.List;




public class ToStringTest {
    public static void main(String[] args) {
        List<Media> ms = new ArrayList<>();
        ms.add(new DigitalVideoDisc("Doraemon", "Anime", "Fujio", 15f));
        ms.add(new Book(0, "Why we sleep", "Scientific", 9f));
        ms.add(new CompactDisc(1, "Gao ranger", "Super sentai", 20f, 2, "Peter"));

        for(Media m : ms) {
            System.out.println(m.toString());
        }
        
    }
}