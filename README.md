<https://segmentfault.com/a/1190000006723754>


# 依赖配置
* logback的核心，logback-core包
* logback建议使用slf4j来管理日志，方便替换底层实现，要用slf4j，就在依赖中加入logback-classic包和slf4j-api包。
* 加入junit测试。


* 可以借助Lombok来简化代码的编写。
  有了Lombok，只需要在要写日志的类中加入@Slf4j等注解，不用再写private static Logger log = LoggerFactory.getLogger(Main.class);


1. logback首先在classpath寻找logback.groovy文件
2. 如果没找到，继续寻找logback-test.xml文件
3. 如果没找到，继续寻找logback.xml文件
4. 如果仍然没找到，则使用默认配置（打印到控制台）