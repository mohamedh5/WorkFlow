package com.kitvision.workflow.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kitvision.workflow.model.Project;

public interface ProjectJpaRepository extends JpaRepository<Project,Integer>{

}
