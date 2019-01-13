# myspringcloud
##项目环境
jdk版本:1.8.0_121"<br>
springboot版本：2.0.3.RELEASE<br>
springcloud版本：Finchley.RELEASE<br>

待优化项<br>
1、Spring Boot Actuator相关配置，参考<https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#production-ready-endpoints>
的第五部分<br>
2、

相关问题<br>
1、maven项目无法识别<br>
解决办法：我使用的是intellij idea，pom文件无maven图标标记，在idea右侧的Maven Projects点击"+"图标，将项目的pom文件加入即可。可参考文章<https://blog.csdn.net/Sunny1994_/article/details/79078768><br>
2、mapper的xml文件方式引入报错<br>
我在base-parent里面配置了resources标签，在ihome-customer项目里面，没有配置，导致xml文件没有被加载，故需要在项目里面配置，如下：<br>
```bash
    <build>
        <resources>
            <resource>
                <directory>src/main/resources</directory>
                <includes>
                    <include>bootstrap.yml</include>
                    <include>bootstrap-${profiles.activation}.yml</include>
                </includes>
                <filtering>true</filtering>
            </resource>
            <resource>
                <directory>src/main/resources</directory>
                <includes>
                    <include>application.yml</include>
                    <include>application-${profiles.activation}.yml</include>
                </includes>
                <filtering>true</filtering>
            </resource>
            <resource>
                <directory>src/main/resources</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
            </resource>
        </resources>
    </build>
```
注意：必须覆盖父pom文件的所有resource项<br>

优秀开源项目引入<br>
1、mybatis-generator-gui<br>
项目地址：https://github.com/zouzg/mybatis-generator-gui<br>
