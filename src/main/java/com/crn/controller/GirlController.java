package com.crn.controller;

import com.crn.common.ResultInfo;
import com.crn.domain.Girl;
import com.crn.service.GirlServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
     * @return Girl
     * @datetime 2018/9/20 9:52
     * @author crn
     */
    @GetMapping(value = "/findone")
    public ResultInfo findGirl(Long id) {
        ResultInfo info = girlService.findGirl(id);
        return info;
    }

    /**
     * 保存女孩(表单校验)
     *
     * @return java.lang.String
     * @datetime 2018/9/20 9:51
     * @author crn
     */
    @PostMapping("/savegirl")
    public String saveGirl(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return bindingResult.getFieldError().getDefaultMessage();
        }

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
