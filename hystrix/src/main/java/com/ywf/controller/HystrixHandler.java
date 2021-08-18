package com.ywf.controller;

import com.ywf.entity.Student;
import com.ywf.feign.FeignProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    private FeignProvider feignProvider;
    @Autowired
    public void setFeignProvider(FeignProvider feignProvider) {
        this.feignProvider = feignProvider;
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProvider.findAll();
    };
    @GetMapping("/index")
    public String index(){
        return feignProvider.index();
    };
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return feignProvider.findById(id);
    };
    @PostMapping("/save")
    public void save(@RequestBody Student student){
        feignProvider.save(student);
    };
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        feignProvider.update(student);
    };
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        feignProvider.deleteById(id);
    };
}
