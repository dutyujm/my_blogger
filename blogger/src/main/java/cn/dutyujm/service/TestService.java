package cn.dutyujm.service;

import cn.dutyujm.model.Test;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

public interface TestService {
    Test insert(Test test);
    List<Test> getAll();
    Page<Test> getPage();

    Integer update(Test test);

}
