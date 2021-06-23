package Iterator;

public class IteratorTester {
    public static void main(String[] args){

        Song70s songs70s = new Song70s();
        Song80s songs80s = new Song80s();
        Song90s songs90s = new Song90s();

        DiscJockey madMike = new DiscJockey(songs70s, songs80s, songs90s);

        madMike.showTheSongs2();

    }
}
