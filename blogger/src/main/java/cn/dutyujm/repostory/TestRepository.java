package cn.dutyujm.repostory;

import cn.dutyujm.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository

public interface TestRepository extends JpaRepository<Test, Integer>, JpaSpecificationExecutor<Test> {
    @Transactional//增删改一定要增加事务
    @Query(value = " insert into test ( username,birthday)values (:username,:birthday)",nativeQuery = true)
    Test insert(@Param("username")String username, @Param("birthday") Date birthday);

    @Transactional//增删改一定要增加事务
    @Modifying
    @Query(value = "update test set username =:#{#test.username}, birthday = :#{# test.birthday} where id =:#{#test.id}",nativeQuery = true)
    Integer update(@Param("test")Test test);



}
