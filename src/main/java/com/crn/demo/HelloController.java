package com.crn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author crn
 * @datetime 2018-09-19 14:41:16
 */
@RestController
public class HelloController {

    /*@Autowired
    private Girl girl;

    //    @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET)
    @GetMapping(value = {"/hello", "/hi"})
    public String hello() {
        return girl.getCupSize();
    }*/
}
