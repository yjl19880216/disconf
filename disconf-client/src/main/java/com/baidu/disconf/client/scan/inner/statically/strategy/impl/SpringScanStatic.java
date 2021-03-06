/*
 * Copyright (C) 2015 KNIGHT, Inc. All Rights Reserved.
 */
package com.baidu.disconf.client.scan.inner.statically.strategy.impl;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;

import com.baidu.disconf.client.scan.inner.statically.model.ScanStaticModel;
import com.baidu.disconf.client.scan.inner.statically.strategy.ScanStaticStrategy;

/**
 * Created by knightliao on 15/1/23.
 */
public class SpringScanStatic implements ScanStaticStrategy {

    private ApplicationContext context;
    private DefaultListableBeanFactory factory;

    /**
     * 构造函数
     *
     * @param context
     */
    public SpringScanStatic(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public ScanStaticModel scan(String packName) {

        factory = (DefaultListableBeanFactory) context.getAutowireCapableBeanFactory();
        return null;
    }

}
