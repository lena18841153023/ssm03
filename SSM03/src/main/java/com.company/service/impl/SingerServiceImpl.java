package com.company.service.impl;

import com.company.dao.idao.SingerDao;
import com.company.dao.pojo.Singer;
import com.company.service.iservice.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
@Service("singerService")
public class SingerServiceImpl implements SingerService {
    @Autowired
    private SingerDao singerDao;
    @Override
    public boolean save(Singer singer) {
        boolean flag = false;
        try {
            flag = singerDao.save(singer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean update(Singer singer) {
        boolean flag = false;
        try {
            flag = singerDao.update(singer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean delete(int singerid) {
        boolean flag = false;
        try {
            flag = singerDao.delete(singerid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<Singer> findByRegion(String region) {
        List<Singer> list = new ArrayList<>();
        try {
            list = singerDao.findByRegion(region);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Singer> findAll() {
        List<Singer> list = new ArrayList<>();
        try {
            list = singerDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Singer findById(int singerid) {
        Singer singer = new Singer();
        try {
            singer = singerDao.findById(singerid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return singer;
    }

    @Override
    public Singer findByName(String sname) {
        Singer singer = new Singer();
        try {
            singer = singerDao.findByName(sname);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return singer;
    }
}
