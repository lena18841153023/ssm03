package com.company.dao.idao;

import com.company.dao.pojo.Song;

import java.util.List;
import java.util.Map;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
public interface SongDao {
    //添加歌曲
    boolean save(Song song) throws Exception;
    //修改歌曲
    boolean update(Song song) throws Exception;
    //删除歌曲
    boolean delete(int songid) throws Exception;
    //根据id查询
    Song findById(int songid) throws Exception;
    //查询所有
    List<Song> findAll() throws  Exception;
    //模糊查询
    List<Song> findByName(Map<String, Object> map)  throws  Exception;
}
