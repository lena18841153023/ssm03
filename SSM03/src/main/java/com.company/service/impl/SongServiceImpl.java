package com.company.service.impl;

import com.company.dao.idao.SongDao;
import com.company.dao.pojo.Song;
import com.company.service.iservice.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
@Service("songService")
public class SongServiceImpl implements SongService {
    @Autowired
    private SongDao songDao;

    @Override
    public boolean save(Song song) {
        boolean flag = false;
        try {
            flag = songDao.save(song);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean update(Song song) {
        boolean flag = false;
        if(song.getSongid() < 1) {
            return false;
        }
        try {
            flag = songDao.update(song);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean delete(int songid) {
        boolean flag = false;
        try {
            flag = songDao.delete(songid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Song findById(int songid) {
        Song song = new Song();
        try {
            song = songDao.findById(songid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return song;
    }

    @Override
    public List<Song> findAll() {
        List<Song> list = new ArrayList<>();
        try {
            list = songDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Song> findByName(String sname) {
        List<Song> list = new ArrayList<>();
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("songname", sname);
            list = songDao.findByName(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
