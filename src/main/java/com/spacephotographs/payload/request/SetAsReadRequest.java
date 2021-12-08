package com.spacephotographs.payload.request;

import lombok.Data;

@Data
public class SetAsReadRequest {
    private Long profileId;
    private Long conversationId;
}
