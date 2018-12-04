package com.liuk.springboot;


//import java.nio.charset.Charset;

import java.util.HashMap;
import java.util.Objects;

public class StringTest {
    public static void main(String[] args) {
       /* char[] chars = "hello".toCharArray();
        String s = new String(chars, 1, 0);
        System.out.println(s);
        System.out.println(Charset.defaultCharset().name());
        System.out.println();*/
        HashMap<Key, Object> hashMap = new HashMap<>();
        for (int i=0;i<10;i++){
            hashMap.put(new Key(i+""),i + "");
        }
        hashMap.put(new Key("34"),"ds");
        System.out.println(hashMap.size());
        System.out.println(hashMap);
    }


}
class Key{
    private String name;

    public Key(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return Objects.equals(name, key.name);
    }

    @Override
    public int hashCode() {

        return Math.round((int)Math.random() * 15);
    }
}