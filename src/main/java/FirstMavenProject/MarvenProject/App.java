package FirstMavenProject.MarvenProject;

import org.joda.time.LocalTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
public class App 
{
	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			public String getMessage() {
				return "Hello World!";
			}
		};
	}
	
    public static void main( String[] args )
    {
    	    LocalTime currentTime = new LocalTime();
    	    System.out.println("The current local time is: " + currentTime);
    		//Greet greet = new Greet(); 		
        //System.out.println(greet.sayGreet());
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
    }
}
