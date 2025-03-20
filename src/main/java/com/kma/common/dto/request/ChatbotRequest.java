package com.kma.common.dto.request;

import com.kma.common.enums.EChatbotType;
import lombok.Data;

@Data
public class ChatbotRequest {
    private EChatbotType type;
    private String content;
    private String sessionId;
}
