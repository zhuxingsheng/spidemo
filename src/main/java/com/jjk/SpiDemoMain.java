package com.jjk;

import com.jjk.spi.Spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 一个spi的demo
 *
 */
public class SpiDemoMain
{
    public static void main( String[] args )
    {
        ServiceLoader<Spi> spiServiceLoader = ServiceLoader.load(Spi.class);

        Iterator<Spi> spiIterator = spiServiceLoader.iterator();

        while ( spiIterator.hasNext()) {
            spiIterator.next().provide();
        }
    }
}
