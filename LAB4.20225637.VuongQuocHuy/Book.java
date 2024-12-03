import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

   
   // public Book() {
   // }

    
    //public int getId() {
    //    return id;
    //}

   // public void setId(int id) {
     //   this.id = id;
    //}

   // public String getTitle() {
    //    return title;
   // }

   // public void setTitle(String title) {
     //   this.title = title;
   // }

    //public String getCategory() {
     //   return category;
    //}

   // public void setCategory(String category) {
    //    this.category = category;
   // }

    //public float getCost() {
    //    return cost;
   // }

    //public void setCost(float cost) {
    //    this.cost = cost;
    //}

    
    public boolean addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author already existed");
            return false;
        } else {
            authors.add(authorName);
            return true;
        }
    }


    public boolean removeAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            System.out.println("Author doesn't exist");
            return false;
        } else {
            authors.remove(authorName);
            return true;
        }
    }
     public Book() {
        super("Unknown", "Unknown", 0f); // Giá trị mặc định
        this.id = 0;
    }
public Book(int id, String title, String category, float cost) {
        super(title, category, cost);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", " + super.toString();
    }
}
