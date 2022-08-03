import icu.insomniac.pojo.User;
import icu.insomniac.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = context.getBean(UserService.class);
        userService.Login("root", "password");
        userService.CheckUsername("root");
    }
}
