package com.di.weixin.common.response;

/**
 * @author di
 * @date 2016年11月15日 下午1:49:29
 * @since 1.0.0
 */
public class CommonResponse {
	private int errcode;
	private String errmsg;

	public int getErrcode() {
		return errcode;
	}

	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

}
