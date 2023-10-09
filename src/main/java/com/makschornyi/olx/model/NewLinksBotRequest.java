package com.makschornyi.olx.model;

import lombok.Data;

import java.util.List;

@Data
public class NewLinksBotRequest {
    private List<String> links;
    private long chatId;
}