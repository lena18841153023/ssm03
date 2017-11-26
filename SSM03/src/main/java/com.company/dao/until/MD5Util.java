package com.company.dao.until;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Whisper on 2017/11/20 0020.
 */
public class MD5Util {
  public static String createMD5(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
      MessageDigest md5 = MessageDigest.getInstance("MD5");
      BASE64Encoder base64Encoder = new BASE64Encoder();
      String newString = base64Encoder.encode(md5.digest(password.getBytes("utf-8")));
      return newString;
  }
}
