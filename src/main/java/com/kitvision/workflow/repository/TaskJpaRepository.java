package com.kitvision.workflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kitvision.workflow.model.Task;

public interface TaskJpaRepository extends JpaRepository<Task, Integer> {

}
