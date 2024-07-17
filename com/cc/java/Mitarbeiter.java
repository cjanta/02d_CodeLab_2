package com.cc.java;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Mitarbeiter {

    private static final String KEY_FAMILY_NAME = "familyName";
    private static final String KEY_FIRST_NAME = "firstName";
    private static final String KEY_ROLE = "role";
    private static final String KEY_YEAR_OF_ENTRY_STRING = "yearOfEntry" ;

    private Map<String, Object> data = new HashMap<>();
    {
        data.put(KEY_FAMILY_NAME, "");
        data.put(KEY_FIRST_NAME, "");
        data.put(KEY_ROLE, "");
        data.put(KEY_YEAR_OF_ENTRY_STRING, "");
    }


    public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry){
        commitChanges(KEY_FAMILY_NAME, familyName);
        commitChanges(KEY_FIRST_NAME, firstName);
        commitChanges(KEY_ROLE, role);
        commitChanges(KEY_YEAR_OF_ENTRY_STRING, Integer.valueOf(yearOfEntry));

    }

    private void commitChanges(String key, Object value) {
        if (data.containsKey(key)) {
            data.put(key, value);
        } else {
            LogHelper.log("FEHLER: Schlüssel wurd nicht gefunden. Mapping fehlerhaft?");
        }
    }

    private Object getData(String key){
        if (data.containsKey(key)) {
            return data.get(key);
        } else {
            LogHelper.log("FEHLER: Schlüssel wurd nicht gefunden. Mapping fehlerhaft?");
            return "";
        }
    }

    public String getInfo(String key){
        return String.valueOf(getData(key));
    }

    public String getInfoDesignation(){
        return data.entrySet().stream()
            .map(e -> "" + e.getKey() + ": " + e.getValue())
            .collect(Collectors.joining("\t"));
    }
}
