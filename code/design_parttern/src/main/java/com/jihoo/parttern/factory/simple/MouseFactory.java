package com.jihoo.parttern.factory.simple;

import com.jihoo.parttern.factory.service.Mouse;
import com.jihoo.parttern.factory.service.impl.AppleMouse;
import com.jihoo.parttern.factory.service.impl.DellMouse;
import com.jihoo.parttern.factory.service.impl.LenovoMouse;

/**
 * @Author：guozhihao
 * @Date：2022/4/18 1:20 下午
 *
 * 简单工厂模式
 * 优点：可以对创建对象进行加工，对客户端隐藏细节。
 * 缺点：1、新增、删除子类均会违反【开闭原则】；
 *      2、创建对象过多造成代码臃肿。
 * 使用场景：1、创建对象的场景较少；
 *         2、客户端不关心对象的创建过程。
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
