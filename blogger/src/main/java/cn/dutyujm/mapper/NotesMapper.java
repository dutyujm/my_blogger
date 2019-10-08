package cn.dutyujm.mapper;

import cn.dutyujm.pojo.Notes;

import java.util.List;

public interface NotesMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(Notes record);

    int insertSelective(Notes record);

    Notes selectByPrimaryKey(Integer nid);

    int updateByPrimaryKeySelective(Notes record);

    int updateByPrimaryKey(Notes record);

    List<Notes> getNotes(Integer num);

    List<Notes> getAllNotes(String title,Integer tmp,Integer limit);

}