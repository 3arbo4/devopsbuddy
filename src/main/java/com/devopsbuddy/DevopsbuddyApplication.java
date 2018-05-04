package com.devopsbuddy;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.devopsbuddy.backend.persistence.domain.backend.Role;
import com.devopsbuddy.backend.persistence.domain.backend.User;
import com.devopsbuddy.backend.persistence.domain.backend.UserRole;
import com.devopsbuddy.backend.service.UserService;
import com.devopsbuddy.enums.PlansEnum;
import com.devopsbuddy.enums.RolesEnum;
import com.devopsbuddy.utils.UsersUtils;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.devopsbuddy.backend.persistence.repositories")
public class DevopsbuddyApplication  implements CommandLineRunner  {

	private static final Logger LOG = LoggerFactory.getLogger(DevopsbuddyApplication.class);
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		String userHome = "user.home";

        // We get the path by getting the system property with the 
        // defined key above.
        String path = System.getProperty(userHome);

        // We print your home path here
        System.out.println("Your Home Path: " + path);

        SpringApplication.run(DevopsbuddyApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		User user = UsersUtils.createBasicUser();
		Set<UserRole> userRoles = new HashSet<>();
		userRoles.add(new UserRole(user, new Role(RolesEnum.BASIC)));
		LOG.debug("Creating user with username {}", user.getUsername());
		userService.createUser(user, PlansEnum.PRO, userRoles);
		LOG.info("User {} created", user.getUsername());
	}
}