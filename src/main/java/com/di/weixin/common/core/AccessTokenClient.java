package com.di.weixin.common.core;

import com.di.toolkit.HttpClientUtil;
import com.di.toolkit.JacksonUtil;
import com.di.weixin.common.response.AccessToken;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

/**
 * @author di
 * @date 2016年11月15日 下午2:39:00
 * @since 1.0.0
 */
public class AccessTokenClient {
	static String APPID = "";
	static String APPSECRET = "";
	static AccessToken token;

	public AccessToken getAccessToken() throws UnrecognizedPropertyException {
		String json = getResponse();
		return JacksonUtil.jsonToPojo(json, AccessToken.class);
	}

	public AccessToken getToken() {
		try {
			return getAccessToken();
		} catch (UnrecognizedPropertyException e) {
			e.printStackTrace();
			return null;
		}
	}

	public String getResponse() {
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + APPID + "&secret="
				+ APPSECRET;
		return HttpClientUtil.get(url);
	}
}
