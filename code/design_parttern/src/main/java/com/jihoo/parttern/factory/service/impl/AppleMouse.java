package com.jihoo.parttern.factory.service.impl;

import com.jihoo.parttern.factory.service.Mouse;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author：guozhihao
 * @Date：2022/4/18 1:18 下午
 */
@Slf4j
public class AppleMouse implements Mouse {
    @Override
    public void sayHi() {
        log.info("我是苹果鼠标");
    }
}
