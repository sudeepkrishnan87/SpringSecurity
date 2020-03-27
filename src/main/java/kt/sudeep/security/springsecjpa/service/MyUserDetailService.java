package kt.sudeep.security.springsecjpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import kt.sudeep.security.springsecjpa.model.MyUserDet;
import kt.sudeep.security.springsecjpa.model.User;
import kt.sudeep.security.springsecjpa.respository.UserRepo;
@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user=userRepo.findByUserName(userName);
		user.orElseThrow(()->new UsernameNotFoundException("Not Found:"+userName));
	 return user.map(MyUserDet::new).get();
	}

}
