# 在线收集文件项目
项目展示链接：<a href="http://kanlon.ink:8082">kanlon.ink:8082</a><br/><br/>
&emsp;&emsp;这个项目主要是帮助班级班委，老师等便捷收集班级同学的文件的小项目。 <br/><br/>
&emsp;&emsp;传统收集文件，图片的方式都是通过微信或邮箱收集，这种收集方法难以统计人数和浪费大量同学们发送邮箱的时间，收集人统计的时间。这个项目采用web项目在线收集和自动统计名单，大大减轻收集人的时间和发送者的时间。
<hr/>

### 项目架构：SpringBoot+Mybatis+MySql+Bootstrap+Jquery

### 项目使用说明
1. 目前该项目主要分为两类用户，一类是学生（游客）用户，另一类是老师（班委）用户。只有老师（班委）用户有登录功能。
2. 学生（游客）端主要页面有以下这个页面。

### 开发进度记录
#### 2018年12月9日
1. 添加部署时的日志路径和学生上传路径，正式部署时要修改，日志路径和Constant类中的上传路径。
2. 添加学生上传文件时，新建一条线程来发送邮件备份，以防数据丢失。
3. 修改126服务器发送邮件端口为465，因为默认的端口25，阿里云服务器已经封了。

#### 2018年12月8日
1. 完成发布任务了和得到任务的链接了，还有添加了任务修改功能，基本功能已经全部完成。
2. 原来以为3天就能完成的，结果打脸了，还是自己太年轻了，整个项目下来花了10天时间左右，比原来预计的多花了3倍时间。
3. 自己对于前端方面还是不太了解了，经过这次，应该以后基本的前端页面已经难不到我了，只想说bootstrap真的太强大了。
4. 以后可能会添加，项目删除，学生上传文件时加上发送邮件，找回密码，上传应交名单统计未交名单，全局异常等功能。

#### 2018年12月7日
1.完成教师或班委查看任务，下载文件，查看所有提交名单的功能页面，和修改学生提交的bug，过了任务的截止时间，则不能再提交了。
2.只差发布任务了和得到任务的链接了。


#### 2018年12月6日
1. 完成学生上传文件功能和学生端的一些其他功能，还差老师或班委的控制页面的设计。


#### 2018年12月5日
1. 完成登录页面功能，还差学生上传文件和老师或班委控制页面的设计



#### 2018年12月4日
1. 完成学生上传文件完善bug功能，老师或班委获取项目链接，增加了一个登陆页面功能
2. 还差学生上传文件和老师或班委控制页面的设计。


#### 2018年12月3日
1. 完成所有后端功能的测试工作，修改将时间转化为字符串传到前端。
2. 添加postman测试链接：[https://documenter.getpostman.com/view/3892535/RzffHouP](https://documenter.getpostman.com/view/3892535/RzffHouP)
3. 还差页面设计，学生上传文件完善bug功能，老师或班委获取项目链接

#### 2018年11月30日
1. 完成登陆注册功能，上传文件，获取压缩包文件功能，基本后端功能已经完成。
2. 还查测试，老师或班委获取项目链接，和前端页面

#### 2018年11月29日
1. 基本框架已经搭建好，使用spring boot +mybatis +mysql +json数据交互。
2. 进度缓慢，还是太久没有做项目了，看来以后需要经常练。
3. 目前后端方面已经实现文件上传功能。

<br/><br/>
2018年11月25日：在这里立下flag，3天之内做好该系统。