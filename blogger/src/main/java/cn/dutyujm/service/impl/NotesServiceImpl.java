package cn.dutyujm.service.impl;

import cn.dutyujm.mapper.NotesMapper;
import cn.dutyujm.pojo.Notes;
import cn.dutyujm.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesServiceImpl implements NotesService {

    @Autowired
    private NotesMapper notesMapper;

    @Override
    public int deleteByPrimaryKey(Integer nid) {
        return notesMapper.deleteByPrimaryKey(nid);
    }

    @Override
    public int insert(Notes record) {
        return notesMapper.insert(record);
    }

    @Override
    public int insertSelective(Notes record) {
        return 0;
    }

    @Override
    public Notes selectByPrimaryKey(Integer nid) {
        return notesMapper.selectByPrimaryKey(nid);
    }

    @Override
    public int updateByPrimaryKeySelective(Notes record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Notes record) {
        return notesMapper.updateByPrimaryKey(record);
    }

    /**
     * 返回固定数量
     * @param num
     * @return
     */
    @Override
    public List<Notes> getNotes(Integer num) {
        return notesMapper.getNotes(num);
    }

    /**
     * 带模糊查询的分页的
     * @param title
     * @param page
     * @param limit
     * @return
     */
    @Override
    public List<Notes> getAllNotes(String title,Integer page,Integer limit) {
        int tmp = (page-1)*limit;
        return notesMapper.getAllNotes(title,tmp,limit);
    }


}
