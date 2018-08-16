package org.firstmvc.springmvcfirst.controller;

import org.firstmvc.springmvcfirst.model.Student;
import org.firstmvc.springmvcfirst.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller //component
public class IndexController {
@Autowired
private StudentService studentService;

    @RequestMapping(value={"/index","/"},method = RequestMethod.GET)
    public String returnIndex(){
        return "index";
    }

    @RequestMapping(value = "/student")
    public String returnStudent(Model model){
     model.addAttribute("studentList",studentService.listallStudent());
     return "student";
    }
    public String returnStudent(){

        return "student"; //dispatcher-> location of jsp
    }
    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String save(@RequestParam("studentName") String studentName,
                       @RequestParam("studentAddress") String studentAddress,
                       @RequestParam("studentPhone") long phone){
        //encapsulate the data that you got from form
        Student student=new Student();
        student.setStudentName(studentName);
        student.setStudentAddress(studentAddress);
        student.setStudentPhone(phone);
        studentService.insert(student);
        return "redirect:/student";
    }
    @RequestMapping(value="/deleteStudent/{id}",method=RequestMethod.GET)
    public String delete(@PathVariable("id") int studentId){
        Student student=new Student();
        student.setStudentId(studentId);
        studentService.delete(student);
        return  "redirect:/student";
    }

   /* @RequestMapping(value="/api/jsondata",method=RequestMethod.GET)
    public @ResponseBody Map<String,String> returnData(){
        Map<String,String> data=new HashMap<String, String>();
        data.put("acb","bac");
        return data;
    }*/
}
