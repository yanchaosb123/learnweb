import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.david.service.HelloService;

import java.util.List;

/**
 * Created by z00473307 on 2019/3/23.
 */
public class TestJpaRepository {

    ApplicationContext ctx ;

    //



    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");



    }

    @Test
    public void testJpaRepository(){

        EntityManagerFactory emf = (EntityManagerFactory)ctx.getBean("entityManagerFactory"); // Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        //em.setProperty();
        assert (em != null);
      //  javax.persistence.
        Query query = em.createQuery("select a from Area a");
        List resultList = query.getResultList();

        assert( resultList != null);

        for(int i =0 ; i< resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }
    }


    @Test
    public void testQueryWithPersistenceContextAnno() {

        HelloService helloService =(HelloService) ctx.getBean("helloService");
        List resultList = helloService.getAreas();

        assert( resultList != null);

        for(int i =0 ; i< resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }

    }
}
