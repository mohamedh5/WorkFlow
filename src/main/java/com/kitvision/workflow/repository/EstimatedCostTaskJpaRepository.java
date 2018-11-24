package com.kitvision.workflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kitvision.workflow.model.EstimatedCostTask;

public interface EstimatedCostTaskJpaRepository extends JpaRepository<EstimatedCostTask, Integer> {

}
