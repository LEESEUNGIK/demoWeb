package com.example.demo.Dto;

import com.example.demo.Type.identifiedType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@Data
@ToString
public class idInfoDTO {
    private identifiedType[] identifiedType;
}
