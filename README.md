# springboot-vue
## 一个 springboot+vue+bootstrap+axios+mybatis 的后台管理系统，有帮助的话求个⭐️
### 三、 项目说明：	
1. 这是一个 springboot 入门级的 demo，实现了前后端分离开发
2. 你可以学到的知识点有:
- 前端：
3. bootstrap 框架的使用，（模态框)
4. vue.js 框架的引入和使用
5. axios 向后台请求数据的过程 get，post

- 后台：
6. `druid` 数据库连接池的配置 和 MySQL驱动
7. `mybatis` 的配置（驼峰命名开闭，别名设置，路径映射，默认日志）
8. `springboot` 接口的编写，实现用户列表渲染和修改用户
9. 后台只需要返回json 字符串即可，如果后台参数是一个对象（如 `User  user`）==》Javabean
在参数前需要加@RequestBody 注解。   
5.数据库文件在 static 目录下，vuejsdemo.sql

- 如何启动？
10. 创建数据库，并在 properties 文件中修改数据库的密码
11. 导入 idea， 安装pom依赖
12. 点击 `Boot1Application.java` 启动
13. 访问：`http://localhost:8089/user.html`

- 关于我：
14. 微信号：bolin_zhao
15. 有问题加我微信，一起进步，咱们互相交流哈哈。
