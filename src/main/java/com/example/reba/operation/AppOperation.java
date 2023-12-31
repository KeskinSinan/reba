package com.example.reba.operation;

import com.example.reba.dto.LoginDto;
import com.example.reba.dto.TableADto;
import com.example.reba.dto.TableBDto;
import com.example.reba.dto.TableCDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

public interface AppOperation {

    @PostMapping("/calculate/a")
    Integer calculateA(@RequestBody TableADto tableADto);

    @PostMapping("/calculate/b")
    Integer calculateB(@RequestBody TableBDto tableBDto);
    @PostMapping("/calculate/reba")
    Integer calculateReba(@RequestBody TableCDto tableCDto);
    @PostMapping("/login")
    Boolean loginCheck(@RequestBody LoginDto loginDto);
}
