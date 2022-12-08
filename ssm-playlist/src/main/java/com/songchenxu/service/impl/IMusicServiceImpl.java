package com.songchenxu.service.impl;

import com.songchenxu.dao.IMusicDao;
import com.songchenxu.domain.Music;
import com.songchenxu.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("musicService")
public class IMusicServiceImpl implements IMusicService {
    @Autowired
    private IMusicDao iMusicDao;

    @Override
    public List<Music> findAll() {
        System.out.println("IMusicServiceImpl的findAll方法被执行了");
        return iMusicDao.findAll();
    }
}
