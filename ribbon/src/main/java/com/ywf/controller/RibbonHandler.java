package com.ywf.controller;

import com.ywf.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/student/index",String.class);
    }
    @RequestMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://provider/student/findAll", Collection.class).getBody();
    }


    @RequestMapping("/findAll2")
    public ArrayList<Student> findAll2(){
        return restTemplate.getForObject("http://provider/student/findAll", ArrayList.class);
    }

    @RequestMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForEntity("http://provider/student/findById/{id}",Student.class,id).getBody();
    }

    @RequestMapping("/findById2")
    public Student findById2(@PathVariable("id") int id){
        return restTemplate.getForObject("http://provider/student/findById/{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForEntity("http://provider/student/save",student,null).getBody();
    }

    @PostMapping("/save2")
    public void save2(@RequestBody Student student){
        restTemplate.postForObject("http://provider/student/save",student,Integer.class);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://provider/student/update",student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") long id){
        restTemplate.delete("http://provider/student/deleteById/{id}",id);
    }
}
