package com.spacephotographs.payload.request;

import lombok.Data;

import java.util.List;

@Data
public class CreateConversationRequest {
    private Long creatorId;
    private List<Long> participants;
}
