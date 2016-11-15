package com.di.weixin.common.core;

import java.util.HashMap;

import com.di.toolkit.HttpClientUtil;
import com.di.toolkit.JacksonUtil;
import com.di.weixin.common.response.CommonResponse;

/**
 * @author di
 * @date 2016年11月15日 下午1:54:31
 * @since 1.0.0
 */
public class ClearQuotaClient {
	private static final String URL = "https://api.weixin.qq.com/cgi-bin/clear_quota";
	private String access_token;
	private String appid;

	public void clear() {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("access_token", access_token);
		params.put("appid", appid);
		HttpClientUtil.doPostSSL(URL, params);
	}

	public CommonResponse clearWithResponse(String access_token, String appid) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("access_token", access_token);
		params.put("appid", appid);
		String res = HttpClientUtil.doPostSSL(URL, params);
		return JacksonUtil.jsonToPojo(res, CommonResponse.class);
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

}
