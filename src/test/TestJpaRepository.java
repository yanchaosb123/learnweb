import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;
import com.david.beans.Area;
import com.david.com.david.dao.AreaRepository;

/**
 * Created by z00473307 on 2019/3/23.
 */
public class TestJpaRepository {

    ApplicationContext ctx ;

    //
    // @Autowired
    // AreaRepository areaRepository;


    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");



    }

    @Test
    public void testJpaRepository(){
        // Area area = areaRepository.findById(1L).orElse(null);
        // System.out.println(area.getArea());
    }
}
