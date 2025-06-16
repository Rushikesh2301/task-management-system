package com.UvTech.TMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UvTech.TMS.Entity.TMSEntity;

public interface TMSRepo extends JpaRepository<TMSEntity, Integer> {

	

}
