package com.company.dao.idao;

import com.company.dao.pojo.Singer;

import java.util.List;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
public interface SingerDao {
    //��Ӹ���
    boolean save(Singer singer) throws Exception;
    //�޸ĸ���
    boolean update(Singer singer) throws Exception;
    //ɾ������
    boolean delete(int singerid) throws Exception;
    //���������ѯ����
    List<Singer> findByRegion(String region) throws Exception;
    //��ѯ���и���
    List<Singer> findAll() throws Exception;
    //����id��ѯ
    Singer findById(int singerid) throws  Exception;
    //�������ֲ�ѯ
    Singer findByName(String sname) throws  Exception;
}
