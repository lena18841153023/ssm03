package com.company.dao.pojo;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
public class Song {
    private int songid;
    private String songname;
    private String urlpath;
    private int singerid;
    private Singer singer;

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Song() {
    }

    public Song(int songid, String songname, String urlpath, int singerid) {
        this.songid = songid;
        this.songname = songname;
        this.urlpath = urlpath;
        this.singerid = singerid;
    }

    public Song(String songname, String urlpath, int singerid) {
        this.songname = songname;
        this.urlpath = urlpath;
        this.singerid = singerid;
    }

    public int getSongid() {
        return songid;
    }

    public void setSongid(int songid) {
        this.songid = songid;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getUrlpath() {
        return urlpath;
    }

    public void setUrlpath(String urlpath) {
        this.urlpath = urlpath;
    }

    public int getSingerid() {
        return singerid;
    }

    public void setSingerid(int singerid) {
        this.singerid = singerid;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songid=" + songid +
                ", songname='" + songname + '\'' +
                ", urlpath='" + urlpath + '\'' +
                ", singerid=" + singerid +
                ", singer=" + singer +
                '}';
    }
}
