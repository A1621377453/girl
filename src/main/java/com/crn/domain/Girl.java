package com.crn.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @author crn
 * @datetime 2018-09-19 16:51:01
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Long id;
    private String cupSize;

    /**
     * 表单校验，禁止小于18岁少女
     */
    @Min(value = 18,message = "未成年少女禁止入内")
    private Integer age;

    public Girl() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}
