package com.asd.gui.app.db.repository;

import com.asd.gui.app.db.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Integer> {



}
