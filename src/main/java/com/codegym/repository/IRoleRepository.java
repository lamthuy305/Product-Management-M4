package com.codegym.repository;

import com.codegym.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends PagingAndSortingRepository<Role,Long> {
}
