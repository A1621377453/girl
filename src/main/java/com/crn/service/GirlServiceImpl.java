package com.crn.service;

import com.crn.exception.GirlException;
import com.crn.common.ResultInfo;
import com.crn.domain.Girl;
import com.crn.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author crn
 * @datetime 2018-09-19 18:29:34
 */
@Service
public class GirlServiceImpl {

    @Autowired
    private GirlRepository girlRepository;

    public Girl findOne(Long id) {
        return girlRepository.findOne(id);
    }

    @Transactional
    public int saveGirl(Girl girl) {
        Girl saveGirl = girlRepository.save(girl);
        if (saveGirl != null) {
            return 1;
        }
        return 0;
    }

    @Transactional
    public void deleteGirl(Long id) {
        try {
            girlRepository.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据id查询女孩信息
     *
     * @param id
     */
    public ResultInfo findGirl(Long id) {
        ResultInfo resultInfo = new ResultInfo();
        Girl girl = findOne(id);
        Integer age = girl.getAge();
        if (age < 18) {
            throw new GirlException(-1, "未成年少女禁止入内");
        }
        resultInfo.setInfo(1, "成功", girl);
        return resultInfo;
    }
}
