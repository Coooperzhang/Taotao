# TaoTaoShop
> 参照传智播客的淘淘商城项目编写的基于Spring，Spring MVC，MyBatis，Redis，Solr的商城项目

* 了解分布式架构及其产生原因，构建Maven项目，并用MyBatis逆向工程长生POJO与DAO接口


* 进行Spring，SpringMVC，MyBatis框架整合，并对项目进行分层（DAO,Service，Controller），使用MyBatis进行商品展示页面分页。

* 实现分布式环境下的图片管理：使用Nginx+ftp搭建负载均衡与图片上传服务器（在Window系统下使用FileZilla Server与Nginx实现，Nginx负责HTTP访问，ftp负责图片上传），并通过apache.commons.net包实现图片上传功能。

* 使用模板思路来实现商品规格，每个商品分类对应一个规格参数模板，每个商品对应唯一的规格参数，在添加商品的时候，生成一个表单，保存规格参数时。还可以生成规格参数的json数据。保存到数据库中。

* 分布式环境下的前台系统搭建，前台页面搭建：
> 方案一：Ajax跨域请求（Jsonp）。
> 方案二：使用httpclient来实现跨域请求。

* CMS系统的实现
> 1.后台管理层：内容分类管理与内容管理。 2.服务层：内容服务的发布 3.前台：使用HttpClient
> 进行请求获取JSON数据到前台展示

* Redis集群的实现，Spring整合jedis，使用Redis实现缓存与缓存同步。
> 缓存同步：在REST服务层增加删除缓存的接口，在Manager的CMS系统增加新数据时，通过HttpClient调用REST的删除缓存方法做到缓存同步。

* 搭建Solr（全文搜索服务器）服务器。
> ①配置业务字段 ②搭建Solr服务 ③SolrJ的增删改查  ④搜索服务的发布

* 商品搜索的实现(Search服务),商品详情的实现。

* SSO单点登陆系统的搭建。
> 使用Redis与UUID（Token）,根据接口文档，实现SSO的登入，登出，检测，注册，通过token查询用户信息。

* 购物车的实现
>
a)	添加商品商品列表写入cookie中。
b)	展示购物车列表，从cookie中取商品列表
c)	修改购物车的商品数量
d)	删除购物车商品。

* 订单系统的实现




