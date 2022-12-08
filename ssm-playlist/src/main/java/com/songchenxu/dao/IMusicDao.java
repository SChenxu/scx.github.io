package com.songchenxu.dao;

import com.songchenxu.domain.Music;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IMusicDao {
    //查询所有音乐
    @Select("select * from playlist")
    List<Music> findAll();
}
