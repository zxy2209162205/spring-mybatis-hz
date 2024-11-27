import com.hz.mapper.EmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//让测试运行于Spring测试环境
@ContextConfiguration( locations = "classpath:spring-config.xml")//提供配置信息
public class EmpMapperTest {

    @Autowired
    private EmpMapper empMapper;
    @Test
    public void testFindEmpById(){
        System.out.println(empMapper.getEmpById(4));

    }
}
