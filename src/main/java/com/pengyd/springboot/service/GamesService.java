package com.pengyd.springboot.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.pengyd.springboot.entity.Games;


public interface GamesService {

    public int insert(Games pojo);

    public int insertList(List< Games> pojos);

    public List<Games> select(Games pojo);

    public int update(Games pojo);

    public List<Games> queryLastGames();

    public List<Games> queryMostHotGames();

    public Games queryRecommendGames();

    public List<Games> queryLargeSizeGames();
}
