import icu.insomniac.service.UserService;
import icu.insomniac.utils.JdbcTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        context.registerShutdownHook();
        UserService userService = context.getBean(UserService.class);
        JdbcTest jdbcTest = context.getBean(JdbcTest.class);
        System.out.println("UserService-------------------------------------------------------------------");
        userService.Login("root", "password");
        userService.CheckUsername("root");
        System.out.println(userService);

        System.out.println("JdbcTest----------------------------------------------------------------------");
        System.out.println(jdbcTest);
    }
}
