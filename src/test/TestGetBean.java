import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;
import com.david.beans.User;

/**
 * Created by z00473307 on 2019/3/19.
 */
public class TestGetBean {

    @Test
    public void testBean() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)ctx.getBean("me");
        System.out.println(user.getName() + " " + user.getPassword());
    }



    @Test
    public void testDuridDataSource() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource dataSource = (DruidDataSource)ctx.getBean("portalDataSource");
        System.out.println(dataSource.getName());
    }




}
