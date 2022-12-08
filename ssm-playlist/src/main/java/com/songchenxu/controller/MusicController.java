package com.songchenxu.controller;

import com.songchenxu.domain.Music;
import com.songchenxu.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("musicController")
public class MusicController {

    @Autowired
    private IMusicService service;

    @RequestMapping("findAll")
    public String findAll(Model model){
        System.out.println("controller的findAll方法");
        List<Music> musicList = service.findAll();
        model.addAttribute("musicList",musicList);
        return "success";
    }
}
