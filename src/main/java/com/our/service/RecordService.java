package com.our.service;

import com.our.domain.records.RecordRepository;
import com.our.dto.records.RecordSaveRequestDto;
import com.our.dto.records.RecordsMainResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class RecordService {

    private RecordRepository recordRepository;

    @Transactional
    public Long save(RecordSaveRequestDto dto){
        return recordRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    public List<RecordsMainResponseDto> findAllDesc(){
        return recordRepository.findAllDesc().map(RecordsMainResponseDto::new).collect(Collectors.toList());
    }
}
