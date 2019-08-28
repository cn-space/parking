package cn.space.common.api.service.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import cn.space.common.entity.FirstDemoEntity;
@FeignClient("business-service-user")
public interface FirstDemoService {
	@PostMapping(value = "/search")
	public FirstDemoEntity search(@RequestParam("id") Integer id);
	@PostMapping(value = "/getId")
	public int getId(@RequestBody FirstDemoEntity demo);

}
