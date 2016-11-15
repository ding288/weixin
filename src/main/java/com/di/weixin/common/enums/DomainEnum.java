package com.di.weixin.common.enums;

/**
 * @author di
 * @date 2016年11月15日 下午2:18:40
 * @since 1.0.0
 */
public enum DomainEnum {
	COMMON("api.weixin.qq.com"), SHANGHAI("sh.api.weixin.qq.com"), SHENGZHENG("sz.api.weixin.qq.com"), HONGKONG(
			"hk.api.weixin.qq.com");
	private final String url;

	DomainEnum(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

}
