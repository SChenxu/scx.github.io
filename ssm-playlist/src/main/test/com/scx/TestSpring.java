package com.scx;

import com.songchenxu.service.IMusicService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    private IMusicService service;

    @Test
    public void testFindAll(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        service = (IMusicService) applicationContext.getBean("musicService");
        service.findAll();
    };
}
