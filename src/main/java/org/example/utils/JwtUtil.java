package org.example.utils;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.UUID;

public class JwtUtil {

    public static final Long TTL = 60 * 60 * 1000L;
    public static final String KEY = "spring security";

    public static String getUUID() {
        String token = UUID.randomUUID().toString().replaceAll("-", "");
        return token;
    }

    /**
     * 生成JWT
     * @return
     */
    public static String generateJWT(String subject) {
        JwtBuilder jwtBuilder = getJwtBuilder(subject, null, getUUID());
        return jwtBuilder.compact();
    }

    /**
     * 生成JWT
     * @param subject
     * @param ttl
     * @return
     */
    public static String generateJWT(String subject, Long ttl) {
        JwtBuilder jwtBuilder = getJwtBuilder(subject, ttl, getUUID());
        return jwtBuilder.compact();
    }

    private static JwtBuilder getJwtBuilder(String subject, Long ttl, String uuid) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        SecretKey secretKey = generalKey();
        long now = System.currentTimeMillis();
        Date nowDate = new Date();
    }
}
