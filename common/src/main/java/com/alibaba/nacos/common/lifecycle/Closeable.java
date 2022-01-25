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

package com.alibaba.nacos.common.lifecycle;

import com.alibaba.nacos.api.exception.NacosException;

/**
 * 接口用于定义资源的关闭和关闭，例如IO Connection和ThreadPool。
 *
 * @author zongtanghu
 */
public interface Closeable {
    
    /**
     * 关闭资源，例如线程池。
     *
     * @throws NacosException exception.
     */
    void shutdown() throws NacosException;
    
}
