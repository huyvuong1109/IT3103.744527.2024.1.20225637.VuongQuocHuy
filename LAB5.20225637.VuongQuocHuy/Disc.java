
public class Disc extends Media{
    private int length;
    private String director;
    
    public Disc(int id, String title, String category, Float cost, int length, String director){
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, float cost){
        super(title, cost);

    }
    public Disc(){
        super();
    }

    public int getLength(){
        return length;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }
    public void setLength(int length){
        this.length = length;
    }
    
}