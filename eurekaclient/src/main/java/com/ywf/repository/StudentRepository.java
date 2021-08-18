package com.ywf.repository;

import com.ywf.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> finAll();
    public Student findById(Long id);
    public void saveOrUpdate(Student student);
    public void  deleteById(Long id);
}
