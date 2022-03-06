package com.our.dto.records;

import com.our.domain.records.Record;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Getter
public class RecordsMainResponseDto {

    private long id;
    private String createdDate;
    private int spend;
    private String purpose;
    private String memo;

    public RecordsMainResponseDto(Record entity){
        id = entity.getId();
        spend = entity.getSpend();
        purpose = entity.getPurpose();
        memo = entity.getMemo();
        createdDate = toStringDateTime(entity.getCreatedDate());
    }

    private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }



}
