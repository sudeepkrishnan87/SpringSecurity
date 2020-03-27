package kt.sudeep.security.springsecjpa.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kt.sudeep.security.springsecjpa.model.User;
@Repository
public interface UserRepo extends JpaRepository<User,Integer>  {

	
	Optional<User>findByUserName(String userName);
}
