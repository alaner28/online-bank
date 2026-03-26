## 项目分层架构

### 1. Controller层 (控制器层)

位于 `src/main/java/com/sweatpear/onlinebank/controller/` 目录下，负责处理HTTP请求和响应，是系统的入口层。为前端提供API接口。


### 2. Service层 (业务逻辑层)

位于 `src/main/java/com/sweatpear/onlinebank/service/` 目录下，包含接口定义和实现类。

- **接口定义** (`service/` 目录)：
- **实现类** (`service/impl/` 目录)：


### 3. DAO层 (数据访问层)

位于 `src/main/java/com/sweatpear/onlinebank/dao/` 目录下，负责与数据库进行交互。

### 4. Model层 (模型层)

位于 `src/main/java/com/sweatpear/onlinebank/model/` 目录下，包含数据传输对象和持久化对象。

- **dto目录** (数据传输对象)：
- **po目录** (持久化对象)：

### 5. Config层 (配置层)

位于 `src/main/java/com/sweatpear/onlinebank/config/` 目录下，包含各种配置类。

### 6. AOP层 (面向切面编程)

位于 `src/main/java/com/sweatpear/onlinebank/aop/` 目录下。

- `ClearRedis.java`: 清除Redis注解定义
- `ClearRedisImpl.java`: 清除Redis实现
- `JwtInterceptor.java`: JWT拦截器
- `Pass.java`: 跳过验证注解定义


### 8. 工具类

位于 `src/main/java/com/sweatpear/onlinebank/util/` 目录下，提供各种工具方法。

