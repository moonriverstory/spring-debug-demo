package demo.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginImpl implements ILogin
{
	String id="";
	@Autowired(required = false)
	public void setId(String id)
	{
		this.id = id;
	}
	public String loginCheck(String userName, String passWord)
	{
		return userName+"-"+passWord;
	}
}