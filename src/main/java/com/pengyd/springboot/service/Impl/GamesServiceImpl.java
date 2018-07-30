package com.pengyd.springboot.service.Impl;

import com.pengyd.springboot.dao.GamesDao;
import com.pengyd.springboot.entity.Games;

import com.pengyd.springboot.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GamesServiceImpl implements GamesService {

    @Resource
    private GamesDao gamesDao;

    public int insert(Games pojo){
        return gamesDao.insert(pojo);
    }

    public int insertList(List< Games> pojos){
        return gamesDao.insertList(pojos);
    }

    public List<Games> select(Games pojo){
        return gamesDao.select(pojo);
    }

    public int update(Games pojo){
        return gamesDao.update(pojo);
    }

    @Override
    public List<Games> queryLastGames() {
        return gamesDao.queryLastGames();
    }

    @Override
    public List<Games> queryMostHotGames() {
        return gamesDao.queryMostHotGames();
    }

    @Override
    public Games queryRecommendGames() {
        return gamesDao.queryRecommendGames();
    }

    @Override
    public List<Games> queryLargeSizeGames() {
        return gamesDao.queryLargeSizeGames();
    }

}
