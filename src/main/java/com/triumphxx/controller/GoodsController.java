package com.triumphxx.controller;


import com.triumphxx.entity.Goods;
import com.triumphxx.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.triumphxx.controller.BaseController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 公众号：北漂码农有话说
 * @since 2020-05-15
 */
@RestController
@RequestMapping("/goods")
public class GoodsController extends BaseController {

    @Autowired
    GoodsService goodsService;

   @RequestMapping("/addgoods")
   public Boolean addGoods(){
       List<Goods> goods = new ArrayList<>();
       for (int i=0;i<=100;i++){
           Goods g = new Goods();
           g.setGoodsId(i+"");
           g.setGoodsName("华为"+i);
           g.setGoodsCommon("名族大品牌"+i);
           goods.add(g);
       }
        goodsService.saveBatch(goods);
       return true;
    }
}
