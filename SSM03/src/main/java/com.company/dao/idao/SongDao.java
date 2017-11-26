package com.company.dao.idao;

import com.company.dao.pojo.Song;

import java.util.List;
import java.util.Map;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
public interface SongDao {
    //��Ӹ���
    boolean save(Song song) throws Exception;
    //�޸ĸ���
    boolean update(Song song) throws Exception;
    //ɾ������
    boolean delete(int songid) throws Exception;
    //����id��ѯ
    Song findById(int songid) throws Exception;
    //��ѯ����
    List<Song> findAll() throws  Exception;
    //ģ����ѯ
    List<Song> findByName(Map<String, Object> map)  throws  Exception;
}
