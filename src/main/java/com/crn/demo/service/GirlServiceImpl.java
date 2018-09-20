package com.crn.demo.service;

import com.crn.demo.domain.Girl;
import com.crn.demo.repository.GirlRepository;
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
}
