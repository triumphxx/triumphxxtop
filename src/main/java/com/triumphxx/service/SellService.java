package com.triumphxx.service;

import com.triumphxx.entity.Sell;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 公众号：北漂码农有话说
 * @since 2020-05-15
 */
public interface SellService extends IService<Sell> {

    void initGoodsSellTop();
}
