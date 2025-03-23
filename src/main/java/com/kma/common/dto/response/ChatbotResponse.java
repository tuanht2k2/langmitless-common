package com.kma.common.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatbotResponse {
    private String message;
    private List<CommonCourseResponse> courses;
}
