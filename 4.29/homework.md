# 阐述redirect和request dispatch的区别  
## Redirect(客户端重定向)  
标准意义上的“重定向”指的是HTTP重定向，它是HTTP协议规定的一种机制。这种机制是这样工作的：当client向server发送一个请求，要求获取一个资源时，在server接收到这个请求后发现请求的这个资源实际存放在另一个位置，于是server在返回的response中写入那个请求资源的正确的URL，并设置reponse的状态码为301（表示这是一个要求浏览器重定向的response)，当client接受到这个response后就会根据新的URL重新发起请求。重定向有一个典型的特症，即，当一个请求被重定向以后，最终浏览器上显示的URL往往不再是开始时请求的那个URL了。  
## Dispatch(服务器端重定向)  
Dispatch（Forward)指的是服务器在处理request的过程中将request先后委托多个servlet或jsp接替进行处理的过程。最为常见的是先由一个Servlet处理（比如实现业务逻辑的计算），然后forward给一个JSP进行视图的渲染。在Servlet里，实现dispatch是通过RequestDispatchers来实现的，而这个类有两个方法，一个是forward,另一个是include,相应的在JSP里实现dispatch的标签也有两个：<jsp:forward/>和<jsp:include/>.  不管是forward还是include，我们可以清楚的看到，从一个servlet或jsp向别一个servlet或jsp跳转，request和reponse始终在期间传递，这是服务器端能实现dispatch模式的关键。换句话说，我们可以把request和reponse看作是一种资源，一系列的servlet和jsp都是在基于同一份资源完成它们职责范围之内的计算。    
# 阐述redirect location的不同形式  
## redirect3种方式  
response.sendRedirect重定向跳转  
ViewResolver直接跳转  
ModelAndView重定向  
## location3种方式  
location.href  
location.assign  
location.replace  


