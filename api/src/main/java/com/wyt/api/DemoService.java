package com.wyt.api;

import java.util.concurrent.CompletableFuture;

/**
 * @author wuyingtan
 * @date 2020/5/15
 */
public interface DemoService {
	public String sayHello(String name);

	public CompletableFuture<String> sayHelloAsync(String name);
}
