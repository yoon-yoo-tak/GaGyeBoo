package com.our.domain.records;

import org.springframework.data.jpa.repository.JpaRepository;

public interface recordRepository extends JpaRepository<Record, Long> {
}
