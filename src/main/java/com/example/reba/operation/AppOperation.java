package com.example.reba.operation;

import com.example.reba.dto.TableADto;
import com.example.reba.dto.TableBDto;
import com.example.reba.dto.TableCDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

public interface AppOperation {

    @GetMapping("/calculate/a")
    Integer calculateA(@RequestBody TableADto tableADto);

    @GetMapping("/calculate/b")
    Integer calculateB(@RequestBody TableBDto tableBDto);
    @GetMapping("/calculate/reba")
    Integer calculateReba(@RequestBody TableCDto tableCDto);
}
