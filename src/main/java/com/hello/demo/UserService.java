package com.hello.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService  {
    User save(User user);
    List<User> findAll();
    Page<User> finaAll(int pageNumber);
}
