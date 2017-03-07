http://127.0.0.1:8080/dn09SSH

主题： ssh的两种整合方案、增加aop的事务处理、jdbc的支持

1.两种ssh整合方案
第一种ssh整合方案：
struts2-spring-plugin-2.1.8.1.jar
	0. 对hibernate的兼容是配置到 ssh.xml中的
	1. 其中的struts-plugin.xml 中的 <constant name="struts.objectFactory" value="spring" />其中的struts-plugin.xml 中的 <constant name="struts.objectFactory" value="spring" />
	核心是覆盖：让Struts交由spring管理的 struts2-core-2.1.8.1.jar 中的已经注释的配置
	# struts.objectFactory = spring
	
	2.需要对spring的装载形式做定义
	默认为
	struts.objectFactory.spring.autoWire = name
	需要在Struts.xml 中更改：

第二种的ssh整合方案：
跟上面的区别就是
对action方法的管理，交给spring管理即可
修改两处：修改量较小，有 "第二种整合方案"的就是 
	1. ssh.xml的增加 action的bean
	2. struts.xml的配置文件中的应答action改为bean的名称即可


系统使用第二种整合方案,struts2的action类部分交由spring管理

2.增加aop事务处理
ssh.xml的表头中增加
xmlns:tx="http://www.springframework.org/schema/tx"
http://www.springframework.org/schema/tx
http://www.springframework.org/schema/tx/spring-tx-2.5.xsd"
配置中依次增加
<bean id="txManager" 
<tx:advice id="txAdvice"
<aop:config>


3.spring使用jdbc进行访问
标识为：  jdbc的数据库访问模式
配置方面只在ssh.xml中进行配置即可,主要修改两个地方：
	1.对dao的来源改为 dataSource
	2.对事务aop的配置源改为 dataSource






