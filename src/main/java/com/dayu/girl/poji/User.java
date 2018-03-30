package com.dayu.girl.poji;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

// @JsonIgnoreProperties(value={"age","name"})//将需要忽略的字段写到一个集合里，不显示到页面
public class User {

    private String name;

    @JsonIgnore // 忽略，不显示给前端
    private String password;
    private Integer age;

    // 时分秒，HH表示24小时制，hh表示12小时制
    // @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", locale="zh", timezone="GMT+8")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss a", locale = "zh", timezone = "GMT+8")
    private Date birthday;

    // 空值忽略
    @JsonInclude(Include.NON_NULL)
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
