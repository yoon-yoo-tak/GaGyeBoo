package com.our.dto.records;

import com.our.domain.records.Record;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RecordSaveRequestDto {
    private int spend;
    private String purpose;
    private String memo;


    @Builder
    public RecordSaveRequestDto(int spend, String purpose, String memo){
        this.spend = spend;
        this.purpose = purpose;
        this.memo = memo;
    }

    public Record toEntity(){
        return Record.builder()
                .spend(spend)
                .purpose(purpose)
                .memo(memo)
                .build();
    }

}
