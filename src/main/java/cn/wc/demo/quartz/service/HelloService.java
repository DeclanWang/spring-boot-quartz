package cn.wc.demo.quartz.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 服务
 *
 * @author WangCong
 * @since 2019-04-23
 */
@Slf4j
@Service
public class HelloService {

    public void hello() {
        log.info("Hello World!");
    }
}
