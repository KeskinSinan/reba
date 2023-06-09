package com.example.reba.controller;

import com.example.reba.dto.TableADto;
import com.example.reba.dto.TableBDto;
import com.example.reba.dto.TableCDto;
import com.example.reba.operation.AppOperation;
import com.example.reba.service.TableAService;
import com.example.reba.service.TableBService;
import com.example.reba.service.TableCService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api")
public class AppController implements AppOperation {

    private final TableAService tableAService;
    private final TableBService tableBService;
    private final TableCService tableCService;

    @Override
    public Integer calculateA(TableADto tableADto) {
        return tableAService.tableACalculation(tableADto);
    }

    @Override
    public Integer calculateB(TableBDto tableBDto) {
        return tableBService.tableBCalculation(tableBDto);
    }

    @Override
    public Integer calculateReba(TableCDto tableCDto) {
        return tableCService.calculateRebaScore(tableCDto);
    }
}
