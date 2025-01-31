package com.trendyol.jdempotent.core.generator;

import com.trendyol.jdempotent.core.model.IdempotencyKey;
import com.trendyol.jdempotent.core.model.IdempotentRequestWrapper;
import java.io.UnsupportedEncodingException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 */
public interface KeyGenerator {

    /**
     *
     * @param requestObject
     * @param listenerName
     * @param builder
     * @param messageDigest
     * @return
     */
    IdempotencyKey generateIdempotentKey(IdempotentRequestWrapper requestObject, String listenerName, StringBuilder builder, MessageDigest messageDigest);
    
    /**
     *
     * @param idempotentHeaderKey     
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.io.UnsupportedEncodingException
     * @return
     */
    IdempotencyKey generateIdempotentKey(String idempotentHeaderKey) throws NoSuchAlgorithmException, UnsupportedEncodingException;

}
