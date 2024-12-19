package nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("CO")
public class ChooseOptions 
{
	@Autowired
	@Qualifier("Python")
	private OnlineCourse course;
	
	public void setChooseOptions(OnlineCourse course)
	{
		this.course=course;
	}
	
	public String Choice()
	{
		String msg=course.Details();
		return msg;
	}
}
