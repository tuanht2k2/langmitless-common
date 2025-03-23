package com.kma.common.dto.request;

import com.kma.common.enums.EMessageType;
import lombok.Data;

@Data
public class EditMessageRequest {
    private String id;
    private String messenger;
    private String content;
    private EMessageType type;
}
