package com.makschornyi.olx;

import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
public class OldSearchRequest {

    private String url;
    private UUID id;
    private boolean isFirstCall = true;
    private int allLinksCount;
    private Set<String> alreadyFoundLinks = new HashSet<>();
    private Type type;
    private long chatId;
}