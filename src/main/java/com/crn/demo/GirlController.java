package com.crn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author crn
 * @datetime 2018-09-19 18:28:33
 */
@RestController
public class GirlController {

    @Autowired
    private GirlServiceImpl girlService;

    /**
     * 根据id查询女孩信息
     *
     * @param id
     * @return com.crn.demo.Girl
     * @datetime 2018/9/20 9:52
     * @author crn
     */
    @GetMapping(value = "/findone")
    public Girl findOne(Long id) {

        Girl girl = girlService.findOne(id);
        return girl;
    }

    /**
     * 保存女孩
     *
     * @param cupSize
     * @param age
     * @return java.lang.String
     * @datetime 2018/9/20 9:51
     * @author crn
     */
    @PostMapping("/savegirl")
    public String saveGirl(String cupSize, Integer age) {

        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        int save = girlService.saveGirl(girl);
        if (save > 0) {
            return "保存成功";
        }
        return "保存失败";
    }

    /**
     * 删除女孩信息
     *
     * @param id
     * @return java.lang.String
     * @datetime 2018/9/20 9:59
     * @author crn
     */
    @DeleteMapping("/delgirl")
    public String deleteGirl(Long id) {

        girlService.deleteGirl(id);
        return "删除成功";
    }

    /**
     * 更新女孩信息
     *
     * @param id
     * @param cupSize
     * @param age
     * @return java.lang.String
     * @datetime 2018/9/20 10:04
     * @author crn
     */
    @PutMapping("/updategirl")
    public String updateGirl(Long id, String cupSize, Integer age) {

        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        int update = girlService.saveGirl(girl);
        if (update > 0) {
            return "更新成功";
        }
        return "更新失败";
    }

}
