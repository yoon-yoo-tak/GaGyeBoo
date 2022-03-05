package com.our.domain.records;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface RecordRepository extends JpaRepository<Record, Long> {

    @Query(value = "SELECT * " + "FROM record " + "ORDER BY id DESC", nativeQuery = true)
    Stream<Record> findAllDesc();
}
