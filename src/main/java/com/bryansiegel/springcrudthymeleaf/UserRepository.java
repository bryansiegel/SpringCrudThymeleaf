package com.bryansiegel.springcrudthymeleaf;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
