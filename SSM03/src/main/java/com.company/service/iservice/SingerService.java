package com.company.service.iservice;

import com.company.dao.pojo.Singer;

import java.util.List;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
public interface SingerService {
    //添加歌手
    boolean save(Singer singer);
    //修改歌手
    boolean update(Singer singer);
    //删除歌手
    boolean delete(int singerid);
    //根据区域查询歌手
    List<Singer> findByRegion(String region);
    //查询�?有歌�?
    List<Singer> findAll();
    //根据id查询
    Singer findById(int singerid);
    Singer findByName(String sname);
}
