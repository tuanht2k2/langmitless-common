package com.kma.common.dto.request;

import lombok.Data;

@Data
public class AiSearchCourseRequest {
    private String cost;
    private Byte level;
    private String language;
}
