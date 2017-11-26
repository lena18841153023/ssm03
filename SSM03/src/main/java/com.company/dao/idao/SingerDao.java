package com.company.dao.idao;

import com.company.dao.pojo.Singer;

import java.util.List;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
public interface SingerDao {
    //添加歌手
    boolean save(Singer singer) throws Exception;
    //修改歌手
    boolean update(Singer singer) throws Exception;
    //删除歌手
    boolean delete(int singerid) throws Exception;
    //根据区域查询歌手
    List<Singer> findByRegion(String region) throws Exception;
    //查询所有歌手
    List<Singer> findAll() throws Exception;
    //根据id查询
    Singer findById(int singerid) throws  Exception;
    //根据名字查询
    Singer findByName(String sname) throws  Exception;
}
