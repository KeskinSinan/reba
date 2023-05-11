package com.example.reba.service;


import com.example.reba.dto.CalculationDto;
import com.example.reba.dto.TableADto;
import com.example.reba.entity.Demo;
import com.example.reba.repository.DemoRepository;
import com.example.reba.repository.TableARepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class TableAService {

    private final DemoRepository demoRepository;
    private final TableARepository repository;

    public Void deneme(String name){
        Demo demo = new Demo();
        demo.setName(name);
        demo.setDescription("Açıklama");
        demoRepository.save(demo);
        return null;
    }

    public static Integer calculateNeck(CalculationDto calculationDto){
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
        }
        if(calculationDto.getAdditionScore1() == true){
            score++;
        }
        if(calculationDto.getAdditionScore2() == true){
            score++;
        }
        return score;
    }
    public Integer calculateTrunk(CalculationDto calculationDto){
        Integer score = 0;
        switch(calculationDto.getOption()) {
            case "A":{
                score = 1;
                break;
            }
            case "B":
            case "C":{
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
        return score;
    }
    public Integer calculateLegs(CalculationDto calculationDto){
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
        if(calculationDto.getAdditionScore1() == true){
            score++;
        }
        if(calculationDto.getAdditionScore2() == true){
            score+=2;
        }
        return score;
    }
    public Integer tableACalculation(TableADto tableADto){
        Integer tableAScore = repository.getTableAPostureScore(tableADto.getNeckScore(),tableADto.getTrunkScore(),tableADto.getLegScore());
        switch(tableADto.getTableAOption()){
            case "":
            case "A":{
                break;
            }
            case "B":{
                tableAScore++;
                break;
            }
            case "C":{
                tableAScore+=2;
                break;
            }
        }
        if(tableADto.getShockOrRapid() == true){
            tableAScore++;
        }
        return tableAScore;
    }
}
