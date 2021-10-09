### spring-cloud 代码模板
* cloud-api()
    * constants
        > FeignClient服务名以及访问路径的常量定义
    * dto
        > 请求dto以及返回dto
    * enums
        > 一些枚举的定义
    * proxy
        > feign接口定义              
* cloud-biz(主要的业务模块，依赖api和core)
    * controller
        > 访问的接口
* cloud-core(工具类、实体、配置类的相关定义)
    * config
        > 一些配置定义，例如要把某个类加入Spring管理
    * constants
        > 常量定义
    * dao
        > 数据库dao层
    * exception
        > 自定义的异常类
    * model
        > 实体类已经Bo业务类
    * service
        > 服务接口以及实现
    * utils
        > 工具类
* cloud-gateway(网关服务)