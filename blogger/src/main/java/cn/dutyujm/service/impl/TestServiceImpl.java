package cn.dutyujm.service.impl;

import cn.dutyujm.model.Test;
import cn.dutyujm.repostory.TestRepository;
import cn.dutyujm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service

public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    /**
     * save方法是如果传了主键就更新，如果没有主键就加入
     * @param test
     * @return
     */
    @Override
    public Test insert(Test test) {
        return  testRepository.save(test);
    }

    @Override
    public List<Test> getAll() {
        return testRepository.findAll();
    }

    /**
     * 分页的操作
     * @return
     */
    @Override
    public Page<Test> getPage(){
        return testRepository.findAll( PageRequest.of(0, 20, Sort.Direction.DESC));
    }


    @Override
    public Integer update(Test test){

        return testRepository.update(test);

    }


}
