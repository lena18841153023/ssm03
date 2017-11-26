package com.company.service.iservice;

import com.company.dao.pojo.Song;

import java.util.List;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
public interface SongService {
    //添加歌曲
    boolean save(Song song);
    //修改歌曲
    boolean update(Song song);
    //删除歌曲
    boolean delete(int songid);
    //根据id查询
    Song findById(int songid);
    //查询全部
    List<Song> findAll();
    //模糊查询
    List<Song> findByName(String sname);
}
