package kt.sudeep.security.springsecjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import kt.sudeep.security.springsecjpa.respository.UserRepo;

@SpringBootApplication
public class SpringSecJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecJpaApplication.class, args);
	}

}
