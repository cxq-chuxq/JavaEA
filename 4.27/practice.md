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


