package com.pengyd.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.pengyd.springboot.entity.Games;

@Mapper
public interface GamesDao {

    int insert(@Param("pojo") Games pojo);

    int insertList(@Param("pojos") List< Games> pojo);

    List<Games> select(@Param("pojo") Games pojo);

    int update(@Param("pojo") Games pojo);
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
