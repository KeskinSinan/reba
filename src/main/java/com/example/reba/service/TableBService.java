package com.example.reba.service;

import com.example.reba.dto.CalculationBDto;
import com.example.reba.dto.CalculationDto;
import com.example.reba.dto.TableBDto;
import com.example.reba.repository.TableBRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TableBService {
    private final TableBRepository repository;
    public static Integer calculateUpperArm(CalculationBDto calculationDto){
        Integer score = 0;
        switch(calculationDto.getOption()) {
            case "A": {
                score = 1;
                break;
            }
            case "B":
            case "C": {
                score = 2;
                break;
            }
            case "D":{
                score = 3;
                break;
            }
            case "E":{
                score = 4;
                break;
            }
        }
        if(calculationDto.getAdditionScore1() == true){
            score++;
        }
        if(calculationDto.getAdditionScore2() == true){
            score++;
        }
        if(calculationDto.getAdditionScore3() == true){
            score++;
        }
        return score;
    }
    public Integer calculateLowerArm(CalculationDto calculationDto){
        Integer score = 0;
        switch(calculationDto.getOption()) {
            case "A":{
                score = 1;
                break;
            }
            case "B": {
                score = 2;
                break;
            }
        }
        return score;
    }
    public Integer calculateWrist(CalculationDto calculationDto){
        Integer score = 0;
        switch(calculationDto.getOption()) {
            case "A":{
                score = 1;
                break;
            }
            case "B":{
                score = 2;
                break;
            }
        }
        if(calculationDto.getAdditionScore1()){
            score++;
        }
        return score;
    }

    public Integer tableBCalculation(TableBDto tableBDto){
        Integer tableBScore = repository.getTableBPostureScore(tableBDto.getLowerArmScore(),tableBDto.getUpperArmScore(),tableBDto.getWristScore());
        switch(tableBDto.getTableBOption()){
            case "":
            case "A":{
                break;
            }
            case "B":{
                tableBScore++;
                break;
            }
            case "C":{
                tableBScore+=2;
                break;
            }
            case "D":{
                tableBScore+=3;
                break;
            }
        }
        return tableBScore;
    }
}
