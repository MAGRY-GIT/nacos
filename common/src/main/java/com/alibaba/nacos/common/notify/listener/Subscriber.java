/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.common.notify.listener;

import com.alibaba.nacos.common.notify.Event;

import java.util.concurrent.Executor;

/**
 * 订阅者接口的抽象订阅者类。
 *
 * @author <a href="mailto:liaochuntao@live.com">liaochuntao</a>
 * @author zongtanghu
 */
@SuppressWarnings("PMD.AbstractClassShouldStartWithAbstractNamingRule")
public abstract class Subscriber<T extends Event> {

    /**
     * 事件回调。
     *
     * @param event {@link Event}
     */
    public abstract void onEvent(T event);

    /**
     * 此订阅者的订阅类型。
     *
     * @return Class which extends {@link Event}
     */
    public abstract Class<? extends Event> subscribeType();

    /**
     * 由侦听器决定回调是异步的还是同步的。
     *
     * @return {@link Executor}
     */
    public Executor executor() {
        return null;
    }

    /**
     * 是否忽略过期事件。
     *
     * @return 默认值是{@link Boolean#FALSE}
     */
    public boolean ignoreExpireEvent() {
        return false;
    }
}
