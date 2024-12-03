import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media a, Media b) {
        return Comparator.comparing(Media::getTitle)
                .thenComparingDouble((o) -> -o.getCost())
                .compare(a, b);
    }
}