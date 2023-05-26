package org.example;

import java.util.HashMap;
import java.util.Map;

public class login {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> dbmap = new HashMap<String, String>();

        for(String[] strings : db) {
            dbmap.put(strings[0], strings[1]);
        }

        // containsKey
        if(dbmap.containsKey(id_pw[0])) {
            // get
            if(dbmap.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            } else {
                return "wrong pw";
            }
        } else {
            return "fail";
        }
    }
}

// containsKey
// 맵(Map)에 해당 키(key)가 있는지를 조사하여 그 결과값을 리턴
// containsKey(id_pw[0]) = id

// get
// key에 해당되는 값(value)을 가져옴
// key : value = id : pw
// .get(id_pw[0]) == pw

// 참고 - https://devlogofchris.tistory.com/41
