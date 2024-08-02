O_LikerDB 致力于实现一个简易版本的 MySQL 数据库（基于 InnoDB 引擎）。该项目不仅涵盖了数据存储、事务管理、多版本并发控制（MVCC）和索引构建等核心数据库功能，还模拟实现了日志管理和事务状态查询等高级特性，旨在深入理解数据库内部机制。



技术亮点：

日志管理：引入数据库日志管理机制，通过日志保障数据一致性，实现故障恢复功能，强化了数据的安全性和稳定性。
事务管理：设计事务状态管理模块，支持事务状态的实时查询，增强了事务控制的灵活性和可视化。
NIO 文件操作：采用 Java NIO 技术优化数据库文件的读写操作，提高数据访问效率。
MVCC 与锁协议：基于两阶段锁（2PL）协议和 MVCC 实现事务的可串行化，优化了读写并发处理，减少阻塞，支持不同隔离级别的实现。
索引与表管理：实现基于 B+ 树的聚簇索引，支持高效的索引查找；并构建表管理器，负责管理表结构和字段信息，包括 SQL 语句的解析功能。
网络通信：通过 Socket 编程实现数据库与客户端的通信，支持执行类 SQL 语句并返回查询结果；客户端提供简易 Shell 界面，方便用户操作。

运行方式
注意首先需要在 pom.xml 中调整编译版本，如果导入 IDE，请更改项目的编译版本以适应你的 JDK

首先执行以下命令编译源码：

mvn compile
接着执行以下命令以 /tmp/mydb 作为路径创建数据库：

mvn exec:java -Dexec.mainClass="top.guoziyang.mydb.backend.Launcher" -Dexec.args="-create /tmp/mydb"
随后通过以下命令以默认参数启动数据库服务：

mvn exec:java -Dexec.mainClass="top.guoziyang.mydb.backend.Launcher" -Dexec.args="-open /tmp/mydb"
这时数据库服务就已经启动在本机的 9999 端口。重新启动一个终端，执行以下命令启动客户端连接数据库：

mvn exec:java -Dexec.mainClass="top.guoziyang.mydb.client.Launcher"
会启动一个交互式命令行，就可以在这里输入类 SQL 语法，回车会发送语句到服务，并输出执行的结果。
