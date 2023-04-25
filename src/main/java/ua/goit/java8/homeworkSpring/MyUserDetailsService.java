package ua.goit.java8.homeworkSpring;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class MyUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public MyUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username).get();
        User user = new User();
        user.setUsername("user3");
        user.setPassword("$2a$12$xCVh8pNsWGgTwIuL4nhC.uGu1WLfvSRkZ41.9DfyP8eSVSM8KbCOe");
        user.setRole("ROLE_ADMIN");
        user.setEnabled(true);

        return new UserPrincipal(user);
    }
}
