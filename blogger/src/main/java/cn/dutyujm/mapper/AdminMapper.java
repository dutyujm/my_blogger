package cn.dutyujm.mapper;

import cn.dutyujm.pojo.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

@Component

public interface AdminMapper extends BaseMapper<Admin> {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    boolean login(String username,String password);


    Admin selectByUsername(String username);
}