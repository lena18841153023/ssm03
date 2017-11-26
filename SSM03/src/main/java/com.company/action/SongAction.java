package com.company.action;

import com.company.dao.pojo.Song;
import com.company.service.iservice.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/21.
 */
@Controller
@RequestMapping("song")
public class SongAction {
    @Autowired
    private SongService songService;

    //查找全部歌曲
    @RequestMapping(value = "findall", method = RequestMethod.GET)
    @ResponseBody
    public List<Song> findAll(){
        List<Song> list=new ArrayList<Song>();
       list=songService.findAll();
        return list;
    }

    //根据id查找歌曲
    @RequestMapping(value="findbyid/{id}",method =RequestMethod.GET)
    @ResponseBody
    public Song findbyid(@PathVariable(value="id") Integer id){
        Song song=null;
        song=songService.findById(id);
        return song;
    }
    //添加歌曲
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String add(Song song){
       boolean flag= songService.save(song);
        return flag?"success":"failed";
    }

    //删除歌曲
    @RequestMapping(value = "del/{id}" ,method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable(value="id") Integer id){
        boolean flag=songService.delete(id);
        return flag?"success":"failed";

    }
  //修改歌曲
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public String update(Song song){
        boolean flag = songService.update(song);
        return flag ? "success" : "failed";
    }
 //歌曲名模糊查询
    @RequestMapping(value = "like",method = RequestMethod.POST)
    @ResponseBody
    public List<Song> like(String name){
        List<Song> list=new ArrayList<Song>();
        list=songService.findByName(name);
        return list;
    }
}
