package com.kma.common.dto.request;

import lombok.Data;

@Data
public class SearchCourseRequest extends CommonSearchRequest{
    private String createdBy;
    private Byte level;
    private String language;
    private Long cost;
}
