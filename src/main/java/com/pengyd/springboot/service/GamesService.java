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

    /**
     * 查询最新的游戏 三条
     * @return
     */
    public List<Games> queryLastGames();

    /**
     * 查询最火的游戏 五条
     * @return
     */
    public List<Games> queryMostHotGames();


    /**
     * 查询推荐的游戏 一条根据查看次数
     * @return
     */
    public Games queryRecommendGames();


    /**
     * 查询大型的游戏 三条
     * @return
     */
    public List<Games> queryLargeSizeGames();
}
