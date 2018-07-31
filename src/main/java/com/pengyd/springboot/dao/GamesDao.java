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
     * ��ѯ���µ���Ϸ ����
     * @return
     */
    public List<Games> queryLastGames();

    /**
     * ��ѯ������Ϸ ����
     * @return
     */
    public List<Games> queryMostHotGames();


    /**
     * ��ѯ�Ƽ�����Ϸ һ�����ݲ鿴����
     * @return
     */
    public Games queryRecommendGames();


    /**
     * ��ѯ���͵���Ϸ ����
     * @return
     */
    public List<Games> queryLargeSizeGames();

}
