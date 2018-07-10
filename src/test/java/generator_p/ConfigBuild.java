package generator_p;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @author shuaiys
 * @Description Mybatis代码生成入口
 *              注: configFile为当前项目文件configGeneratorConfig.xml的存放路径
 * @Date 2018-07-10 11:11
 */
public class ConfigBuild {
private File configFile;
    
    @Before
    public void before() {
        //读取mybatis参数
        configFile = new File("E:\\generator-p\\src\\main\\resources\\configGeneratorConfig.xml");
    }
    
    @Test
    public void build() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
