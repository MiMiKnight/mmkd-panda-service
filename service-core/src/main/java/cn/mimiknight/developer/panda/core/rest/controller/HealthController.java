package cn.mimiknight.developer.panda.core.rest.controller;

import cn.mimiknight.developer.panda.core.rest.controller.standard.AppApiPath;
import cn.mimiknight.developer.panda.core.rest.controller.standard.HealthStandard;
import cn.mimiknight.developer.panda.core.rest.model.response.HealthCheckResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检查前端控制器
 *
 * @author MiMiKnight victor2015yhm@gmail.com
 * @since 2023-08-18 22:39:13
 */
@Slf4j
@RestController
@ResponseStatus(HttpStatus.OK)
@RequestMapping(path = AppApiPath.Module.HEALTH)
public class HealthController implements HealthStandard {

    @GetMapping(path = "/servlet/v1/check", produces = MediaType.APPLICATION_JSON_VALUE)
    @Override
    public HealthCheckResponse check() {
        return new HealthCheckResponse();
    }
}
