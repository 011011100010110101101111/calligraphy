package com.hpwenxue.oauth2;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Date;
import java.util.UUID;

/**
 * 生成token
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-20 14:41
 */
public class TokenGenerator {

    public static String generateValue() {
        return generateValue(UUID.randomUUID().toString());
    }

    private static final char[] hexCode = "0123456789abcdef".toCharArray();

    public static String toHexString(byte[] data) {
        if (data == null) {
            return null;
        }
        StringBuilder r = new StringBuilder(data.length * 2);
        for (byte b : data) {
            r.append(hexCode[(b >> 4) & 0xF]);
            r.append(hexCode[(b & 0xF)]);
        }
        return r.toString();
    }

    public static String generateValue(String param) {
        try {
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(param.getBytes());
            byte[] messageDigest = algorithm.digest();
            return toHexString(messageDigest);
        } catch (Exception e) {
//            throw new RRException("生成Token失败", e);
            throw new RuntimeException("ss");
        }
    }

    /**
     * 创建jwt token
     *
     * @param expires n小时后失效
     */
    public static String createToken(long expires, Long userid, String password) {
        String token = "";
        try {
            token = JWT.create().
                    withExpiresAt(new Date(System.currentTimeMillis() + (expires * 1000))).
                    withSubject(String.valueOf(userid)).
                    sign(Algorithm.HMAC256(password));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return token;
    }

    /**
     * 获得token 信息
     */
    public static String tokenInfoAsString(String token, String key) {
        DecodedJWT dJWT = JWT.decode(token);
        return dJWT.getClaim(key).asString();
    }

    public static Long tokenInfoAsLong(String token, String key) {
        DecodedJWT dJWT = JWT.decode(token);
        return dJWT.getClaim(key).asLong();
    }

    public static Long getSub(String token) {
        DecodedJWT dJWT = JWT.decode(token);
        return Long.valueOf(dJWT.getSubject());
    }

    public static Date getExpiresAt(String token) {
        DecodedJWT dJWT = JWT.decode(token);
        return dJWT.getExpiresAt();
    }

    /**
     * 验证token 有效性
     *
     * @param token
     * @param password
     * @throws UnsupportedEncodingException
     */
    public static void verifyToken(String token, String password) throws UnsupportedEncodingException {
        JWT.require(Algorithm.HMAC256(password)).build().verify(token);
    }
}
