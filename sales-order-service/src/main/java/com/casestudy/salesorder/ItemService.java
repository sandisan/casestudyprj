package com.casestudy.salesorder;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="item-service", fallback = ItemServiceFallback.class)
@RibbonClient(name="item-service")
public interface ItemService {
	
	@GetMapping("/item/{itemName}")
	public Item getItemByName(@PathVariable("itemName") String itemName);

}