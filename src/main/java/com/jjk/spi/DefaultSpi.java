package com.jjk.spi;

/**
 * @author JackChu (jackchu2015@foxmail.com)
 * @date 2017/1/9
 */
public class DefaultSpi implements Spi{

    @Override
    public void provide() {
        System.out.println("默认spi实现");
    }

}
