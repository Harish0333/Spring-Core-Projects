package nit.sbeans;

import org.springframework.stereotype.Component;

@Component("Python")

public class Python implements OnlineCourse {

	@Override
	public String Details() 
	{
		System.out.println();
		return "Python course added";
	}

}
