package edu.miu.demo.version2.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostV2Dto {
    private long id;
    private String title;
    private String content;
}
