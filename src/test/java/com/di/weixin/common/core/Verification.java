package com.di.weixin.common.core;

import com.di.toolkit.EncryptionUtil;

/**
 * @author di
 * @date 2016年11月15日 下午2:11:54
 * @since 1.0.0
 */
public class Verification {
	public boolean verify(String token, String signature, String timestamp, String nonce) {
		String s = token + timestamp + nonce;
		String hex = EncryptionUtil.sha1Hex(s);
		return hex.equals(signature);
	}
}
