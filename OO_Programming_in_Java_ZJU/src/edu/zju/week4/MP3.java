package edu.zju.week4;

public class MP3 extends Item {
    private String album;
    private String artist;
    private int trackNo;

    public MP3(String title, String album, String artist, int trackNo, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.album = album;
        this.artist = artist;
        this.trackNo = trackNo;
    }

    public static void main(String[] args) {
        MP3 mp3 = new MP3("Groovy", "init", "John Doe", 1, 1, "..");
        mp3.print();
    }

    @Override
    public String toString() {
        return "MP3{" + super.toString() +
                ", album='" + album + '\'' +
                ", artist='" + artist + '\'' +
                ", trackNo=" + trackNo +
                '}';
    }

    public void print() {
        System.out.print("MP3:");
        super.print();
        System.out.println("," + album + "," + artist + "," + trackNo);
    }
}
