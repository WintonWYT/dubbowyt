package com.wyt.producer;

import com.wyt.api.DemoService;
import org.apache.dubbo.rpc.RpcContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
/**
 * @author wuyingtan
 * @date 2020/5/15
 */
public class DemoServiceImpl implements DemoService {
	private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

	@Override
	public String sayHello(String name) {
		logger.info("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
		return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
	}

	@Override
	public CompletableFuture<String> sayHelloAsync(String name) {
		CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
			return "async result";
		});
		return cf;
	}
}
