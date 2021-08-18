package com.ywf.feign.impl;

import com.ywf.entity.Student;
import com.ywf.feign.FeignProvider;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignError implements FeignProvider {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中!";
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(long id) {

    }
}
