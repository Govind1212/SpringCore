import com.springcore.lifecycle.Child;
import com.springcore.lifecycle.Teacher;
import com.springcore.lifecycle.Tution;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Testlifecycle {
    public static void main(String[]args) throws IOException
    {
        /*
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Child c1 = (Child) ctx.getBean("ch");
        System.out.println(c1);
        //Registering ShutdownHook
        ctx.registerShutdownHook();

        ///////////////////////////////////////////////////////////////

        Teacher tc = (Teacher) ctx.getBean("tc");
        System.out.println(tc);
         */

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Tution ti = (Tution) ctx.getBean("ti");
        System.out.println(ti);
        ctx.registerShutdownHook();
    }
}
