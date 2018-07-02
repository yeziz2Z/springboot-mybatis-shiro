package com.liuk.springboot.common;

import org.apache.commons.lang3.Validate;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.hash.SimpleHash;

import java.security.SecureRandom;

/**
 * 加密工具
 */
public class EncryptUtil {

    private static SecureRandom random = new SecureRandom();

    private EncryptUtil(){
    }

    /**
     * 生成随机的 byte[] 作为 salt
     * @param numBytes byte[] 长度
     * @return
     */
    public static byte[] generateSalt(int numBytes){
        Validate.isTrue(numBytes > 0,"长度必须大于 0.", numBytes);
        byte[] bytes = new byte[numBytes];
        random.nextBytes(bytes);
        return bytes;
    }

    public static void main(String[] args) {
        /*byte[] bytes = generateSalt(8);
        String encode = Hex.encodeToString(bytes);
        System.out.println(encode);
        String pwd = "12345";

        SimpleHash md5 = new SimpleHash("MD5", pwd, bytes, 1024);
        System.out.println(encode + md5.toString());*/
        String s = "f951267cceef432a";
        byte[] decode = Hex.decode(s);
        System.out.println(Hex.encodeToString(decode));
    }
 }
