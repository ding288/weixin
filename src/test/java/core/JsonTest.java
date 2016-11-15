package core;

import org.junit.Test;

import com.di.toolkit.JacksonUtil;
import com.di.weixin.common.response.AccessToken;

/**
* @author di
* @date 2016年11月15日 下午2:29:46
* @since 1.0.0
*/
public class JsonTest {
	@Test
	public void test(){
		String s="{\"access_tokena\":\"aaaa\",\"expires_in\":7200}";
		AccessToken token = JacksonUtil.jsonToPojo(s, AccessToken.class);
		System.out.println(token.getAccessToken());
	}
}
