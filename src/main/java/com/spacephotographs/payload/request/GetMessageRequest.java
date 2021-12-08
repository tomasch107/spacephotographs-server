package com.spacephotographs.payload.request;

import lombok.Data;

@Data
public class GetMessageRequest {
    private Long conversationId;
    private int page;
    private int size;
    private Long profileId;
}
