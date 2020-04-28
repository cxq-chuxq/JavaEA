# Servlet  
## 打开tomcat启动服务步骤：  
1.cd ApacheTomcat/bin  
2../startup.sh 
## 互联网简介  
TCP是Transmission Control Protocol,传输控制协议  
IP是Internet Protocol，网络协议   
## TCP/IP协议  
客户端-服务器（Client-Server）模型  
客户端：向服务器请求提供服务  
服务端：提供计算服务  
HTTP协议定义了如何与超文本交互，定义了一套与网页交互的工作  
## 访问一个网页时发生了什么  
首先去查询DNS（Domain Naming Service）服务器，DNS服务器会将网址转化成IP地址。有了IP地址，浏览器就可以基于HTTP协议，向远程的Web服务器发送请求了。Web服务器收到请求后，会调用后端的一系列功能并且重新组装出HTML页面，通过HTTP协议返回给浏览器。浏览器把返回的HTML文本渲染成为一个美观并且可读的页面。  
这整个过程是在TCP/IP协议之上完成的，Web请求和Web响应都会按照TCP协议要求的方式进行打包和传输。
## 什么是HTTP协议  
### 请求流的关键元素：  
HTTP方法（要执行的操作）  
要访问的页面（一个URL）  
表单参数（类似于amethod的参数）  
### 响应流的关键元素：  
状态代码（用于确定请求是否成功）  
内容类型（文本、图片、HTML等）  
内容（实际的HTML、图像等）  
## URL  
Unified Resource Locator  
<scheme>://<使用者>:<密码>@<主机>:<端口号>/<路径>   
## 在Tomcat上部署  
### 配置Tomcat管理用户名和密码  
在conf/tomcat_user.xml下加入下列代码：  
<role rolename="manager-gui"/>  
<role rolename="manager-script"/>  
<user username="admin" password="password"  roles="manager-gui, manager-script"/>  
重启Tomcat  
### 在Maven中配置Tomcat的用户名和密码  
在~~/.m2/settings.xml下加入下列代码；  
<server>  
    <id>TomcatServer</id>  
    <username>admin</username>  
    <password>password</password>    
</server>
## 创建项目过程  
新建文件夹  
输入mvn archetype:generate  
输入10  
groupId: club.banyuan  
artifactId: example  
输入Y  
在idea中打开文件  
### 在pom.xml中配置  
servlet依赖  
<dependency>  
  <groupId>javax.servlet</groupId>  
  <artifactId>javax.servlet-api</artifactId>  
  <version>4.0.1</version>  
  <scope>provided</scope>  
</dependency>  
JRE版本  
<plugin>  
     <artifactId>maven-compiler-plugin</artifactId>  
     <configuration>  
         <source>11</source>  
         <target>11</target>  
     </configuration>  
</plugin>  
配置Tomcat的插件  
<plugin>  
      <groupId>org.apache.tomcat.maven</groupId>  
      <artifactId>tomcat7-maven-plugin</artifactId>  
      <version>2.2</version>  
      <configuration>  
          <url>http://localhost:8080/manager/text</url>  
          <server>TomcatServer</server>  
          <path>/myapp</path>  
      </configuration>  
   </plugin>  
### 在web.xml中配置serclet映射关系  
<servlet>      
      <servlet-name>my-1st-servlet</servlet-name>     
      <servlet-class>club.banyuan.ServletDemo</servlet-class>    
  </servlet>    
  <servlet-mapping>    
      <servlet-name>my-1st-servlet</servlet-name>    
      <url-pattern>/aaa</url-pattern>    
  </servlet-mapping>    
新建java项目  
生成war文件：mvn package  
部署或卸载应用  
mvn tomcat7:deploy  
mvn tomcat7:redeploy  
mvn tomcat7:undeploy  




