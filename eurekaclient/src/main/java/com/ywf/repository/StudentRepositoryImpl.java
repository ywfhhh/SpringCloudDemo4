package com.ywf.repository;

import com.ywf.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository{
    private static Map<Long,Student> studentMap=new HashMap<>();
    private static Long count;
    static {
        studentMap.put(1L,new Student(1L,"zs",23));
        studentMap.put(2L,new Student(2L,"ww",23));
        studentMap.put(3L,new Student(3L,"ls",23));
        count=3L;
    }
    @Override
    public Collection<Student> finAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        if(studentMap.get(student.getId())==null){
            studentMap.put(student.getId(),student);
        }else {
            studentMap.replace(student.getId(),student);
        }
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }

}
