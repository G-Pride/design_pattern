package com.jihoo.parttern.factory.method;

import com.jihoo.parttern.factory.service.Mouse;
import com.jihoo.parttern.factory.service.impl.LenovoMouse;

/**
 * @Author：guozhihao
 * @Date：2022/4/18 3:24 下午
 */
public class LenovoFactory implements MouseFactory{
    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }
}
