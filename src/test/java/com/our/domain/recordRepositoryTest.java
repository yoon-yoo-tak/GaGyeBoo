package com.our.domain;

import com.our.domain.records.Record;
import com.our.domain.records.RecordRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.CoreMatchers.is;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
public class recordRepositoryTest {

    @Autowired
    RecordRepository recordRepository;

    @Test
    public void save_load(){
        //given
        recordRepository.save(Record.builder()
                .spend(3400)
                .purpose("asd")
                .memo("ddd").build());

        //when

        List<Record> recordList = recordRepository.findAll();

        //then
        Record record = recordList.get(0);
        assertThat(record.getPurpose(), is("asd"));
        assertThat(record.getMemo(),is("ddd"));

    }

}
