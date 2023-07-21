package ro.msg.learning.shop.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ro.msg.learning.shop.entities.CustomerEntity;
import ro.msg.learning.shop.mappers.CredentialsMapper;
import ro.msg.learning.shop.repositories.CustomerRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements UserDetailsService {
    private final CustomerRepository repository;
    private final CredentialsMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CustomerEntity customer = repository.findByUsername(username)
                .orElseThrow(() -> {
                    throw new UsernameNotFoundException("User " + username + " not found");
                });
        return mapper.mapEntityToModel(customer);
    }

    @Bean
    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
