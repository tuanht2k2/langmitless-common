package com.kma.common.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonCourseResponse {
    private String id;
    private String name;
    private String description;
    private Long cost = 0L;
    private String language;
}
