# generator-p-MyBatis-
Mybatis自动生成工具。
功能：能自动生成底层代码。包括自动设置分页，几乎单表的任何数据操作都能实现。

使用方法：
1.下载项目到本地。
2.项目需要一个mysql-connector-java-5.1.18.jar。此jar包的路径存放于configGeneratorConfig.xml文件中，可自行修改文件位置。
3.配置configGeneratorConfig.xml,包括数据源，生成文件的包路径，以及需要生成的表数据。
4.将项目包名更换为自定义的。
5.配置ConfigBuild,配置configFile为当前项目文件configGeneratorConfig.xml的存放路径。
6.执行ConfigBuild.build()。
