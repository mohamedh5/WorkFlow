package com.kitvision.workflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kitvision.workflow.model.Phase;

public interface PhaseJpaRepository extends JpaRepository<Phase, Integer> {

}
