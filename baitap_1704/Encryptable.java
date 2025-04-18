package com.example.baitap_1704;

public interface Encryptable {
    String encrypt(String data) throws Exception;
    String decrypt(String data) throws Exception;
}