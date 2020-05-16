## 简介
#### 本demo主要用redis实现一些具有排行榜等的功能
* 今日热卖排行榜
* 博客本周热帖
* 本周热点信息

#### 表设计实思路
 ` 以商品热买榜为例：简单设计如下`
 * 商品信息表（goods）：商品id（goods_id）、商品名称（goods_name）、商品描述（goods_common）
 * 商品销售信息表（sell）：销售id（sell_id）、商品id（goods_id）、销售数量（sell_num）、销售时间（sell_date）