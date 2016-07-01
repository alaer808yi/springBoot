package com.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.models.LoginLog;

@Repository
@Transactional
public interface LoginLogRepository extends PagingAndSortingRepository<LoginLog, Serializable>,JpaSpecificationExecutor<LoginLog>{

}
