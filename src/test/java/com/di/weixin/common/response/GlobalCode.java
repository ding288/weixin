package com.di.weixin.common.response;

public enum GlobalCode {
	BUSY(-1, "系统繁忙，请稍候再试"), SUCCESS(0, "请求成功"), 
	TOKEN_INVALID(40001,"获取access_token时AppSecret错误，或者access_token无效。"),
	ILLEGAL_DOCUMENT_TYPE(40002, "不合法的凭证类型"),
	ILLEGAL_OPEN_ID(40003, "不合法的OpenID，请开发者确认OpenID（该用户）是否已关注公众号，或是否是其他公众号的OpenID"),
	ILLEGAL_MEDIA_TYPE(40004, "不合法的媒体文件类型"),
	ILLEGAL_FILE_TYPE(40004, "不合法的文件类型"),
	ILLEGAL_FILE_SIZE(40005, "不合法的文件大小"),
	ILLEGAL_MEDIA_ID(40005, "不合法的媒体文件id"),
	ILLEGAL_MSGS_TYPE(40005, "不合法的消息类型"),
	ILLEGAL_IMAGE_SIZE(40005, "不合法的图片文件大小"),
	ILLEGAL_VOICE_SIZE(40005, "不合法的语音文件大小"),
	ILLEGAL_VIDEO_SIZE(40005, "不合法的视频文件大小"),
	ILLEGAL_THUMBNAILS_SIZE(40012,"不合法的缩略图文件大小"),
	ILLEGAL_APP_ID(40013,"不合法的AppID，请开发者检查AppID的正确性，避免异常字符，注意大小写"),
	ILLEGAL_ACCESS_TOKEN(40014,"不合法的access_token，请开发者认真比对access_token的有效性（如是否过期），或查看是否正在为恰当的公众号调用接口"),
	ILLEGAL_MENU_TYPE(40015,"不合法的菜单类型"),
	ILLEGAL_BUTTON_NUMS1(40016,"不合法的按钮个数"),
	ILLEGAL_BUTTON_NUMS2(40017,"不合法的按钮个数"),
	ILLEGAL_BUTTON_NAME_LENGTH(40018,"不合法的按钮名字长度"),
	ILLEGAL_BUTTON_KEY_LENGTH(40019,"不合法的按钮KEY长度"),
	ILLEGAL_BUTTON_URL_LENGTH(40020,"不合法的按钮URL长度"),
	ILLEGAL_MENU_VERSION_NUM(40021,"不合法的菜单版本号"),
	ILLEGAL_SUBMENU_SERIES(40022,"不合法的子菜单级数"),
	ILLEGAL_SUBMENU_BUTTON_NUMS(40023,"不合法的子菜单按钮个数"),
	ILLEGAL_SUBMENU_BUTTON_TYPE(40024,"不合法的子菜单按钮类型"),
	ILLEGAL_SUBMENU_BUTTON_NAME_LENGTH(40025,"不合法的子菜单按钮名字长度"),
	ILLEGAL_SUBMENU_BUTTON_KEY_LENGTH(40026,"不合法的子菜单按钮KEY长度"),
	ILLEGAL_SUBMENU_BUTTON_URL_LENGTH(40027,"不合法的子菜单按钮URL长度"),
	ILLEGAL_USE_CUSTOM_MENU_USER(40028,"不合法的自定义菜单使用用户"),
	ILLEGAL_OAUTH_CODE(40029,"不合法的oauth_code"),
	ILLEGAL_REFRESH_TOKEN(40030,"不合法的refresh_token"),
	ILLEGAL_OPEN_ID_LIST(40031,"不合法的openid列表"),
	ILLEGAL_OPEN_ID_LIST_LENGTH(40032,"不合法的openid列表长度"),
	ILLEGAL_CHARACTER_REQUEST(40033,"不合法的请求字符，不能包含\\uxxxx格式的字符"),
	ILLEGAL_PARAMETERS(40035,"不合法的参数"),
	ILLEGAL_REQUEST_FORMAT(40038,"不合法的请求格式"),
	ILLEGAL_URL_LENGTH(40039,"不合法的URL长度"),	
	ILLEGAL_GROUP_ID(40050,"不合法的分组id"),
	ILLEGAL_GROUP_NAME1(40051,"分组名字不合法"),
	ILLEGAL_GROUP_NAME2(40117,"分组名字不合法"),	
	ILLEGAL_MEDIA_ID_SIZE(40118,"media_id大小不合法"),
	BUTTON_TYPE_ERROR(40119,"button类型错误"),
	BUTTON_TYPE_ERROR2(40120,"button类型错误"),
	ILLEGAL_MEDIA_ID_TYPE(40121,"不合法的media_id类型"),
	ILLEGAL_WECHAT_ACCOUNT(40132,"微信号不合法"),
	UNSUPPORTED_IMAGE_FORMAT(40137,"不支持的图片格式"),
	MISSING_ACCESS_TOKEN_PARAMETER(41001,"缺少access_token参数"),
	MISSING_APP_ID_PARAMETER(41002,"缺少appid参数");

	private final int code;
	private final String desc;

	GlobalCode(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return desc;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
	public static String getDesc(int code) {
		for(GlobalCode grc:GlobalCode.values()){
			if(grc.getCode()==code){
				return grc.getDesc();
			}
		}
		return null;
	}
}
