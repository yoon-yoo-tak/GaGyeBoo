package com.our.domain.records;

import com.our.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Record extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // 번호

    private LocalDateTime date; // 날짜

    private int spend; // 사용금액

    private String purpose; // 목적

    private String memo; // 메모

    @Builder
    public Record(int spend, String purpose, String  memo){
        this.spend = spend;
        this.purpose = purpose;
        this.memo = memo;
    }

}
