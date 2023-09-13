package com.makschornyi.olx;

import lombok.Data;

import java.util.List;

@Data
public class NewLinksBotRequest {
    private List<String> links;
    private long chatId;
}