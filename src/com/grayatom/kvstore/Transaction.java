package com.grayatom.kvstore;

import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Getter
public class Transaction {
    Map<String, VersionedValue> readSet;
    Map<String, String> writeSet;
    Set<String> deleteSet;

    public Transaction() {
        this.readSet = new HashMap<>();
        this.writeSet = new HashMap<>();
        this.deleteSet = new HashSet<>();
    }
}