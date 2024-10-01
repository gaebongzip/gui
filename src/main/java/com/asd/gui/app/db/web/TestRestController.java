package com.asd.gui.app.db.web;

import com.asd.gui.app.db.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestRestController {

    private final ApplicationContext context;


    @GetMapping(value = "/test")
    public String test(){
        //ApplicationContext ac = new AnnotationConfigApplicationContext();

        TestRepository tr = (TestRepository) context.getBean("testRepository");
        tr.findAll();
        return "test";
    }
}
