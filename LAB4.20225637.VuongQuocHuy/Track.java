
public class Track implements Playable{
    private String title;
    private int length;

    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }
    public String getTitle(){
        return title;
    }
    public int getLength(){
        return length;
    }
     public void play(){
      System.out.println("Playing Track: " + this.getTitle());
      System.out.println("Track length: " + this.getLength());
    }
    @Override
public boolean equals(Object o) {
    if (!(o instanceof Track)) return false; 
    Track other = (Track) o; 
    return other.getTitle().equals(title) && other.getLength() == length;
}

}   