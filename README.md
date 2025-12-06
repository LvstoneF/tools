# NSFOCUS Report Tool (绿盟漏扫报告处理工具)

这是一个用于处理绿盟漏扫报告（doc版本）的文档处理工具。

## 环境要求

- Java Development Kit (JDK) 8 或更高版本
- Git

## 如何运行

您的 JDK 安装在 `C:\Program Files\Java\jdk1.8.0_151`，但未添加到系统 PATH 中。请使用以下命令编译和运行：

1.  **编译代码**：
    ```bash
    & "C:\Program Files\Java\jdk1.8.0_151\bin\javac.exe" src/Main.java
    ```

2.  **运行程序**：
    ```bash
    java -cp src Main
    ```

> **提示**：为了方便以后使用，建议将 `C:\Program Files\Java\jdk1.8.0_151\bin` 添加到您的系统环境变量 `Path` 中。

## 项目同步

本项目已托管于 GitHub：[https://github.com/LvstoneF/tools](https://github.com/LvstoneF/tools)

### 常用命令

- **提交更改**：
    ```bash
    git add .
    git commit -m "描述您的更改"
    git push
    ```
