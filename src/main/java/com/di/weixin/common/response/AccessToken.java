package com.di.weixin.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author di
 * @date 2016年11月15日 下午2:27:09
 * @since 1.0.0
 */
public class AccessToken {
	@JsonProperty(value="access_token")
	private String accessToken;
	@JsonProperty(value="expires_in")
	private int expiresIn;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

}
