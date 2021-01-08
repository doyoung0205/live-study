package com.company.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Optional;

public class UserRepository implements CrudRepository<User, Long> {
    @Override
    public Iterable<User> findAll() {
        System.out.println("user 객체 전부를 조회");
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        System.out.printf("%d 가 아이디인 user 객체 조회 \n", id);
        return Optional.empty();
    }
    
}
