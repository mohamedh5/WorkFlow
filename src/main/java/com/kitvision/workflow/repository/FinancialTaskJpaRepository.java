package com.kitvision.workflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kitvision.workflow.model.FinancialTask;

public interface FinancialTaskJpaRepository extends JpaRepository<FinancialTask, Integer> {

}
