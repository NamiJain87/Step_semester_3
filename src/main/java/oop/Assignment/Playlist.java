package main.java.oop.Assignment;

public class Playlist {

    private String[] songs;
    private int songCount;

    public Playlist(int capacity) {
        songs = new String[capacity];
        songCount = 0;
    }

    public void addSong(String song) {
        if (songCount < songs.length) {
            songs[songCount] = song;
            songCount++;
        } else {
            System.out.println("Playlist is full.");
        }
    }

    public String[] getSongs() {
        return songs.clone();
    }

    public int getSongCount() {
        return songCount;
    }

    public static void main(String[] args) {

        Playlist playlist = new Playlist(3);

        playlist.addSong("Perfect");
        playlist.addSong("Shape of You");
        playlist.addSong("Believer");

        System.out.println("Song count: " + playlist.getSongCount());

        String[] songList = playlist.getSongs();

        System.out.println("Songs:");
        for (String song : songList) {
            System.out.println(song);
        }

        // Modifying returned array
        songList[0] = "Changed Song";

        System.out.println("\nOriginal playlist:");
        for (String song : playlist.getSongs()) {
            System.out.println(song);
        }
    }
}