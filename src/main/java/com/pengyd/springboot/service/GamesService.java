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
