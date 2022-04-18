package com.jihoo.parttern.factory.method;

import com.jihoo.parttern.factory.service.Mouse;
import com.jihoo.parttern.factory.service.impl.AppleMouse;

/**
 * @Author：guozhihao
 * @Date：2022/4/18 3:19 下午
 */
public class AppleFactory implements MouseFactory{
    @Override
    public Mouse createMouse() {
        return new AppleMouse();
    }
}
