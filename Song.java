public class Song
{
    private String title;
    private String artist;
    private int durationInSeconds;
    private boolean liked;

    public Song(String title, String artist, int durationInSeconds)
    {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
        liked = false;
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public int getDuration()
    {
        return durationInSeconds;
    }

    public boolean isLiked()
    {
        return liked;
    }

    public void setLiked(boolean state)
    {
        liked = state;
    }

    public String toString()
    {
        return "Song[title=" + title + ",artist=" + artist + ",durationInSeconds=" +
                durationInSeconds + ",liked=" + liked + "]";
    }
}
        