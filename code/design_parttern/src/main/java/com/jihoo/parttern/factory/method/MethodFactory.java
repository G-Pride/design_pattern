package com.jihoo.parttern.factory.method;

import com.jihoo.parttern.factory.service.Mouse;

/**
 * @Author：guozhihao
 * @Date：2022/4/18 3:18 下午
 *
 * 工厂方法
 *
 */
public class MethodFactory {

    public static void main(String[] args) {
        MouseFactory mouseFactory = new AppleFactory();
        Mouse mouse = mouseFactory.createMouse();
        mouse.sayHi();
    }

}
