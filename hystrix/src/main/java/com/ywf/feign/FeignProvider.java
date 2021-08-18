package com.ywf.feign;

import com.ywf.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@FeignClient(value = "provider")
public interface FeignProvider {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/index")
    public String index();
    @GetMapping("/student/findById/{id}")
    public Student findById(@PathVariable("id") long id);
    @PostMapping("/student/save")
    public void save(@RequestBody Student student);
    @PutMapping("/student/update")
    public void update(@RequestBody Student student);
    @DeleteMapping("/student/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);
}
