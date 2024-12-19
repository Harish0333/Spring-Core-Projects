package nit.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("java")
@Primary
public class Java implements OnlineCourse {

	@Override
	public String Details() {
		
		return "Java Course added";
	}

}
