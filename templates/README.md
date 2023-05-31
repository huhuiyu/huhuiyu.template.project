# 模板项目集

## 项目目录

- [java基础项目](/templates/java-project/)

## idea配置说明

- 乱码问题：
  - 控制台设置：打开`Help->Edit Custom VM options...`菜单，添加内容：`-Dfile.encoding=UTF-8`
  - 单个项目设置：打开`File->Settings...`菜单，选择：`Editor->File Encodings`选项，将所有的`Encoding`选项设置为`UTF-8`
  - 新项目设置：打开`File->New Projects Setup->Settings For New Projects...`菜单，选择：`Editor->File Encodings`选项，将所有的`Encoding`选项设置为`UTF-8`
  - gradle项目设置：打开`File->Settings...`菜单，选择：`Build,Execution,Deployment->Build Tools->Gradle`选项，将`Build and run using`和`Run tests using`选项修改为`IntelliJ IDEA`
