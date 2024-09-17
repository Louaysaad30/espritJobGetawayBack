package Esprit.tn.EspritJobGetaway;

import Esprit.tn.EspritJobGetaway.Repository.UserRepository;
import Esprit.tn.EspritJobGetaway.config.RsakeysConfig;
import Esprit.tn.EspritJobGetaway.Repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableConfigurationProperties(RsakeysConfig.class)
@RequiredArgsConstructor
public class EspritJobGetawayApplication implements CommandLineRunner {
	private  final RoleRepository roleRepository;
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(EspritJobGetawayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       /* Stream.of(RoleType.ADMIN, RoleType.USER , RoleType.COMPANY, RoleType.STAFF)
            .forEach(roleType -> {
               Role role= new Role();
               role.setRoleType(roleType);
               roleRepository.save(role);
            });
       User admin=new User();
        Role role=roleRepository.findByRoleType(RoleType.ADMIN).get();
        admin.setFirstName("admin");
        admin.setLastName("admin");
        admin.setEmail("admin@esprit.tn");
        admin.setPhone("28598395");
        admin.setRoles(List.of(role));
        admin.setEnabled(true);
        admin.setNonLocked(true);
        admin.setPassword(passwordEncoder.encode("adminADMIN#1919"));
       userRepository.save(admin);
				*/}
}
