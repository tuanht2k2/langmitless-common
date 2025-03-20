package com.kma.common.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class IndexCourseRequest {
    private String id;
    private String name;
    private String language;
    private Long cost;
    private String level;
    private String description;
    private List<String> topics;
}
