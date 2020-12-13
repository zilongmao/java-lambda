package com.idol;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 * TODO:
 *
 * @Author 邻座旅客
 * Create by 湖南爱豆 on 2020/12/14 02:51
 */
public class Base64Test {

    public static void main(String[] args) {
        String str = "邻座旅客";
        try {
            // 使用基本编码
            String base64baseEncodedString = Base64.getEncoder().encodeToString(str.getBytes("utf-8"));
            System.out.println("Base64 编码字符串 (基本) :" + base64baseEncodedString);
            // 解码
            byte[] base64baseDecodedBytes = Base64.getDecoder().decode(base64baseEncodedString);
            System.out.println("原始字符串: " + new String(base64baseDecodedBytes, "utf-8"));


            // 使用URL编码
            String base64urlEncodedString = Base64.getUrlEncoder().encodeToString(str.getBytes("utf-8"));
            System.out.println("Base64 编码字符串 (URL) :" + base64urlEncodedString);
            // 解码
            byte[] base64urlDecodedBytes = Base64.getUrlDecoder().decode(base64urlEncodedString);
            System.out.println("原始字符串: " + new String(base64urlDecodedBytes, "utf-8"));


            // 使用MIME编码
            String base64mimeEncodedString = Base64.getMimeEncoder().encodeToString(str.getBytes("utf-8"));
            System.out.println("Base64 编码字符串 (MIME) :" + base64mimeEncodedString);
            // 解码
            byte[] base64mimeDecodedBytes = Base64.getMimeDecoder().decode(base64mimeEncodedString);
            System.out.println("原始字符串: " + new String(base64mimeDecodedBytes, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}
