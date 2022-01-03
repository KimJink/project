package com.project.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Builder
@Getter
public class SearchModel {
    private Map<String, String> user;
    private String id;
}
