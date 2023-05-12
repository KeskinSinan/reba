package com.example.reba.service;

import com.example.reba.dto.TableCDto;
import com.example.reba.repository.TableCRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TableCService {
    private final TableCRepository repository;
    public Integer calculateRebaScore(TableCDto tableCDto){
        Integer tableCScore = repository.getTableCScore(tableCDto.getTableAScore(),tableCDto.getTableBScore());
        if (tableCDto.getTableCOption1() == true) {
            tableCScore++;
        }
        if (tableCDto.getTableCOption2() == true) {
            tableCScore++;
        }
        if (tableCDto.getTableCOption3() == true) {
            tableCScore++;
        }
        return tableCScore;
    }
}
