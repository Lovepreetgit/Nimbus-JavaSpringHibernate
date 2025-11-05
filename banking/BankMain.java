import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankMain {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        AccountService service = context.getBean(AccountService.class);
        // Transfer money (example)
        service.transfer(1, 2, 100.0);

        context.close();
    }
}
