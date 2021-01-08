package com.company.interfaces;

import java.util.Optional;

public class UserService {
    public static void main(String[] args) {
        final CrudRepository userRepository = new UserRepository();
        final Optional user = userRepository.findById(1L);

        final UserRepository userRepository2 = new UserRepository();
        final Optional user2 = userRepository2.findById(1L);
    }
}
