package com.spacephotographs.payload.request;

import lombok.Data;

@Data
public class SendMessageRequest {
    Long conversationId;
    Long userProfileId;
    String messageText;
}
