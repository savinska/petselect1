package com.softuni.petselect.repository;

import com.softuni.petselect.model.entity.BlockedIP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlackListRepository extends JpaRepository<BlockedIP, Long> {
}
