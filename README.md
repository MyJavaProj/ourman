# ourman

first_struts_proj: 页面跳转</br>
一步一步创建struts2项目    </br>

配置好java运行环境（我的是jdk8.0,tomcat7.0）</br>
创建Dynamic Web Project 项目 </br>
添加struts2对应包到WEB-INF/lib文件夹下面  </br>
继续在WEB-INF文件夹添加web.xml文件</br>
在web.xml文件夹新增struts2过滤器      </br>
Java Resources/src下面新建包com.tarena.outman,在此包下新建WelcomeAction.java类,勇于执行跳转操作  </br>    
新增显示页面 namefomr.jsp,welcome.jsp (WebContent/jsp/xxx.jsp)。其中nameform.jsp为初始页面，点击提交按钮跳转到welcome页面。</br>
Java Resources/src下新建struts.xml文件，添加相应package，action,result,把之前操作和页面连接起来。  </br>

注意：</br>
nameform.jsp 页面 action对应WelcomeAction.java类的位置</br>
浏览器访问地址：http://localhost:9091/ourman/jsp/nameform.jsp
