package com.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.models.LoginLog;

@Repository

public interface LoginLogRepository extends PagingAndSortingRepository<LoginLog, Serializable>,JpaSpecificationExecutor<LoginLog>{

}
