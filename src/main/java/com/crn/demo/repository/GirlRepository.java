package com.crn.demo.repository;

import com.crn.demo.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author crn
 * @datetime 2018-09-19 18:30:10
 */
public interface GirlRepository extends JpaRepository<Girl, Long> {
}
