package Composite;

public class DiscJockey {
    SongComponent songList;

    // newSongList contain every Song, SongGroup, and any Songs saved in SongGroup
    public DiscJockey(SongComponent newSongList){
        songList = newSongList;
    }

    // calls the displayInfo() on every Song or SongGroup stored in songList
    public void getSongList(){
        songList.displaySongInfo();
    }
}
