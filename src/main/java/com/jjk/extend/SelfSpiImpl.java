package com.jjk.extend;

import com.jjk.spi.Spi;

/**
 * @author JackChu (jackchu2015@foxmail.com)
 * @date 2017/1/9
 */
public class SelfSpiImpl implements Spi{
    @Override
    public void provide() {

        System.out.println("自定义spi实现");

    }
}
