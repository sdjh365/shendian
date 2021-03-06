package com.example.managerService.shop;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.managerDao.shop.entity.ShopHelpGratisEvent;

import java.util.HashMap;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-07-23
 */
public interface IShopHelpGratisEventService extends IService<ShopHelpGratisEvent> {

    /**
     * 根据id查询助力免单
     * @param map
     * @return
     */
    HashMap<String,Object> getHelpGratisEventById(HashMap<String,Object> map);

    /**
     * 查询助力秒单列表
     * @param map
     * @return
     */
    HashMap<String,Object> getHelpGratisList(HashMap<String,Object> map);

    /**
     * 修改助力免单
     * @param map
     * @return
     */
    int saveHelpGratis(HashMap<String,Object> map);
}
