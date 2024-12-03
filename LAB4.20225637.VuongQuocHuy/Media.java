
public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(){}

    public Media(String title, float cost){
        this.title = title;
        this.cost = cost;
    }
    public String getTitle() {
    return title;
    }

    public Media(String title, String category, float cost){
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public Media(int id, String title, String category, float cost){
        this(title, category, cost);
        this.id = id;
    }

    //public boolean equals(Object o){
    //    if(!(o instanceof Media)) return false;
    //    return ((Media) o).getTitle().equals(this.title);
   // }
    public int getId(){
        return id;
    }
    public void setId(int id) {
    this.id = id;
}

    public float getCost() {
        return cost;
    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Media)) return false;
        return ((Media) o).getTitle().equals(this.title);
    }
     
}