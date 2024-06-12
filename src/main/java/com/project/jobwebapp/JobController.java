package com.project.jobwebapp;

import com.project.jobwebapp.model.JobPost;
import com.project.jobwebapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @Autowired   //Controller communicating with service (Dependent)
    private JobService service;

    @GetMapping({"/","home"})   //GET method
    public String home(){
        return "home";  //home.jsp
    }

    @GetMapping("addjob")    //GET method
    public String addJob(){
        return "addjob";   //addjob.jsp
    }

    @PostMapping("handleForm")   //POST method
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";  //success.jsp
    }




}
