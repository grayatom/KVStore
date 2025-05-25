package com.grayatom.kvstore;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class VersionedValue {
    private String value;
    private Integer version;
}
