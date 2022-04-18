package com.jihoo.parttern.factory.simple;

import com.jihoo.parttern.factory.service.Mouse;
import com.jihoo.parttern.factory.service.impl.AppleMouse;
import com.jihoo.parttern.factory.service.impl.DellMouse;
import com.jihoo.parttern.factory.service.impl.LenovoMouse;

/**
 * @Author：guozhihao
 * @Date：2022/4/18 1:20 下午
 */
public class MouseFactory {

    public static void main(String[] args) {
        Mouse mouse = MouseFactory.createMouse(3);
        mouse.sayHi();
    }

    private static Mouse createMouse(int i) {
        switch (i){
            case 1: return new AppleMouse();
            case 2: return new DellMouse();
            default: return new LenovoMouse();
        }

    }
}
