package com.iot.breathingMeachin.repository;

import com.iot.breathingMeachin.entity.MayThoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MayThoRepository extends JpaRepository<MayThoEntity, Integer> {
}
