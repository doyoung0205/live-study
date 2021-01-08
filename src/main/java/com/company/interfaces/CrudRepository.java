package com.company.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Optional;

public interface CrudRepository<T, ID> {

    Iterable<T> findAll();

    Optional<T> findById(ID id);

    default Iterable<T> findAll(Sort var1) {
        return null;
    }

    default Page<T> findAll(Pageable var1) {
        return null;
    }

}
