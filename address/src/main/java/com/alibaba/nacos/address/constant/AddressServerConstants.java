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

package com.alibaba.nacos.address.constant;

import com.alibaba.nacos.naming.misc.UtilsAndCommons;

/**
 * 地址服务器的统一常量参数命名和默认值 ​​为相关参数。
 *
 * @author pbting
 * @date 2019-06-17 7:23 PM
 * @since 1.1.0
 */
public interface AddressServerConstants {


    /**
     * 创建实例对象时的默认服务器端口。
     */
    int DEFAULT_SERVER_PORT = 8848;

    /**
     * 当 post ips 没有给出产品时，则使用默认值。
     */
    String DEFAULT_PRODUCT = "nacos";

    /**
     * 原始服务名称和组之间的服务名称分隔符。
     */
    String GROUP_SERVICE_NAME_SEP = "@@";

    /**
     * 当 post ips 没有给集群时，则使用默认值。
     */
    String DEFAULT_GET_CLUSTER = "serverlist";

    /**
     * post multi ip 将使用“，”来分隔。
     */
    String MULTI_IPS_SEPARATOR = ",";

    /**
     * 使用命名和配置部署 nacos 时的默认产品名称。
     */
    String ALIWARE_NACOS_DEFAULT_PRODUCT_NAME = "nacos.as.default";

    /**
     * 当配置和命名分开部署时，必须由客户端指定产品名称。
     */
    String ALIWARE_NACOS_PRODUCT_DOM_TEMPLATE = "nacos.as.%s";

    /**
     * 地址服务器前缀的 url。
     */
    String ADDRESS_SERVER_REQUEST_URL =
            UtilsAndCommons.NACOS_SERVER_CONTEXT + UtilsAndCommons.NACOS_SERVER_VERSION + "/as";

}
