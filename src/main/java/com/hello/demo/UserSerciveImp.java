package com.hello.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSerciveImp implements UserService {

    //field based DI
    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Page<User> finaAll(int pageNumber) {
        return userRepository.findAll(PageRequest.of(pageNumber, AppConstant.RECORD_PER_PAGE));
    }
}
