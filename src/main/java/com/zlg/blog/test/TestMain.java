package com.zlg.blog.test;

import com.alibaba.fastjson.JSON;
import com.zlg.blog.core.Result;

public class TestMain {
	public static void main(String[] args) {
		Result result = new Result();
		result.setCode(200);
		result.setSuccess(true);
		result.setMessage("成功!");
		
		
		System.out.println(JSON.toJSONString(result));
	}

}
