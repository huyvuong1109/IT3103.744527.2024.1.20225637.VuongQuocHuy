import java.util.List;
import java.util.ArrayList;
public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<>();
    public CompactDisc(int id, String title, String category, float cost, int length, String director){
        super(id, title, category, cost,length, director);
    }
    public CompactDisc(String title, float cost){
        super(title, cost);
    }
    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist, List<Track> tracks){
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks.addAll(tracks);
    }
    public boolean addTrack(Track track){
        if (tracks.contains(track)){
            System.out.println("Track already existed");
            return false;
        } else {
            tracks.add(track);
            System.out.println("Track added successfully");
            return true;
        }
    } 
    public boolean removeTrack(Track track){
        if(!tracks.contains(track)){
             System.out.println("No such track found");
            return false;
        } else {
            tracks.remove(track);
            System.out.println("Track removed successfully");
            return true;
        }
    } 
    @Override
    public int getLength(){
        int length = 0;
        for(Track track : tracks){
            length += track.getLength();
        } return length;
    }
    public void play(){
        for(Track track : tracks){
            track.play();
        }
    }
   
        } 
    