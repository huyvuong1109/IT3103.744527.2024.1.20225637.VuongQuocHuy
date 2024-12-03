public class DigitalVideoDisc extends Disc implements Playable{
    private String title;
   private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDisc = 0;
    private int id;
  public DigitalVideoDisc(String title){
    super();
   setTitle(title);
    nbDigitalVideoDisc++;
    setId(nbDigitalVideoDisc);
  }
  public DigitalVideoDisc(String title, float cost){
    super(title, cost);
  }
  public DigitalVideoDisc(String category, String title, float cost){
    this(title);
    setCategory(category);
    setCost(cost);
  }
  
  public DigitalVideoDisc(String director, String category, String title, float cost){
    this(category, title, cost);
    setDirector(director);

  }
  public DigitalVideoDisc(String title, String category, String director, int length, float cost){
    this(director, category,title, cost);
    setLength(length);
  }
    public String getTitle(){
       return title;
    }
    
   public void setTitle(String title){
     this.title = title;
  }

    public String getCategory(){
        return category;
    }

   public void setCategory(String category){
       this.category = category;
    }

    public String getDirector(){
        return director;
   }

    public void setDirector(String director){
        this.director = director;
    }

    public int getLength(){
       return length;
    }
    public int getId(){
        return id;
    }
    public void setLength(int length){
        this.length = length;
    }

    public float getCost(){
        return cost;

   }
    public void setCost(float cost){
        this.cost = cost;
    }
    public void play(){
      System.out.println("Playing DVD: " + this.getTitle());
      System.out.println("DVD length: " + this.getLength());
    }
    
   // public DigitalVideoDisc(){
   //    nbDigitalVideoDisc++;
   //    this.id = nbDigitalVideoDisc; 
   // }
   // public DigitalVideoDisc(String title){
    //   this();
    //  this.title = title;
   // }

   // public DigitalVideoDisc(String title, String category, float cost){
    //    this();
    //    this.title = title;
    //    this.category=category;
    //   this.cost = cost;
  // }

// public DigitalVideoDisc(String title, String category, String director, int length, float cost){
 //       this.title = title;
 //       this.category = category;
 //       this.director = director;
 //       this.length = length;
 //      this.cost = cost;
 //   }
}