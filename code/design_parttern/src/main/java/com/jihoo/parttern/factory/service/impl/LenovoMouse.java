package com.jihoo.parttern.factory.service.impl;

import com.jihoo.parttern.factory.service.Mouse;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author：guozhihao
 * @Date：2022/4/18 1:23 下午
 */
@Slf4j
public class LenovoMouse implements Mouse {
    @Override
    public void sayHi() {
        log.info("我是联想鼠标");
    }
}
