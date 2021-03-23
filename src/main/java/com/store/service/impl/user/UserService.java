package com.store.service.impl.user;

import com.store.converter.IConverter;
import com.store.entity.productBrand.ProductBrandEntity;
import com.store.entity.user.UserEntity;
import com.store.model.productBrand.ProductBrand;
import com.store.model.user.User;
import com.store.repository.productBrand.ProductBrandRepository;
import com.store.repository.user.UserRepository;
import com.store.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

@org.springframework.stereotype.Service
public class UserService implements Service<User> {
    private UserRepository userRepository;
    private IConverter<UserEntity, User> userConverter;


    @Override
    public List<User> getAll() {
        return userConverter.convertAll((List<UserEntity>) userRepository.findAll());
    }

    @Override
    public void add(User user) {
        userRepository.save(userConverter.convertReverse(user));
    }

    @Override
    public boolean deleteById(long id) {
        userRepository.deleteById(id);
        if (userRepository.getById(id) == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void edit(User user) {
        userRepository.save(userConverter.convertReverse(user));
    }

    @Override
    public User getById(long id) {
        return userConverter.convert(userRepository.findById(id).get());
    }

    public User getByEmail(String email) {
        return userConverter.convert(userRepository.findByEmail(email));
    }

    @Autowired
    public void setUserConverter(IConverter<UserEntity, User> userConverter) {
        this.userConverter = userConverter;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(userConverter.convertReverse(user));
    }

    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        final UserEntity user = userRepository.findByEmail(email);
        if (user == null){
            throw new UsernameNotFoundException(email);
        }
        UserDetails userDetails = org.springframework.security.core.userdetails.User
                .withUsername(user.getEmail())
                .password(user.getPassword())
                .authorities(user.getRole().getName()).build();
        return userDetails;
    }
}
