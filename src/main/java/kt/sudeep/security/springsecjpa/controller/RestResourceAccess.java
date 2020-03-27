package kt.sudeep.security.springsecjpa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestResourceAccess {
	
	 @GetMapping("/")
	public String getForAll()
	{
		return "<h1>Hi All</h1>";
	}
	 @GetMapping("/admin")
	 public String getAdmins()
	 {
		 return "<h1>Hi Admin User</h1>";
		 
	 }

	 @GetMapping("/user")
	 public String getUser()
	 {
		HttpServletRequest req;
			
		 return "<h1>Hi all users</h1>";
		 
	 }
}
