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

package com.alibaba.nacos.common.notify;

import com.alibaba.nacos.common.notify.listener.Subscriber;

/**
 * 分片事件发布者。
 *
 * <p>为不同的事件支持一个出版商。
 *
 * @author xiweng.yy
 */
public interface ShardedEventPublisher extends EventPublisher {
    
    /**
     * 为默认共享发行者添加侦听器。
     *
     * @param subscriber    {@link Subscriber}
     * @param subscribeType 订阅事件类型，如慢速事件、普通事件。
     */
    void addSubscriber(Subscriber subscriber, Class<? extends Event> subscribeType);
    
    /**
     * 删除默认共享发行者的侦听器。
     *
     * @param subscriber    {@link Subscriber}
     * @param subscribeType 订阅事件类型，如慢速事件、普通事件。
     */
    void removeSubscriber(Subscriber subscriber, Class<? extends Event> subscribeType);
}
