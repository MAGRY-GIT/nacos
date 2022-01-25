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

package com.alibaba.nacos.api;

/**
 * 属性键常量。
 *
 * @author Nacos
 */
public class PropertyKeyConst {

    /**
     * 是否使用云名称空间解析
     */
    public static final String IS_USE_CLOUD_NAMESPACE_PARSING = "isUseCloudNamespaceParsing";

    /**
     * 使用端点解析规则吗
     */
    public static final String IS_USE_ENDPOINT_PARSING_RULE = "isUseEndpointParsingRule";

    /**
     * 端点
     */
    public static final String ENDPOINT = "endpoint";

    /**
     * 端点端口
     */
    public static final String ENDPOINT_PORT = "endpointPort";

    /**
     * 名称空间
     */
    public static final String NAMESPACE = "namespace";

    /**
     * 用户名
     */
    public static final String USERNAME = "username";

    /**
     * 密码
     */
    public static final String PASSWORD = "password";

    /**
     * 访问密钥
     */
    public static final String ACCESS_KEY = "accessKey";

    /**
     * 秘密密钥
     */
    public static final String SECRET_KEY = "secretKey";

    /**
     * ram角色名
     */
    public static final String RAM_ROLE_NAME = "ramRoleName";

    /**
     * 服务地址
     */
    public static final String SERVER_ADDR = "serverAddr";

    /**
     * 上下文路径
     */
    public static final String CONTEXT_PATH = "contextPath";

    /**
     * 集群名称
     */
    public static final String CLUSTER_NAME = "clusterName";

    /**
     * 编码
     */
    public static final String ENCODE = "encode";

    /**
     * 配置长轮询超时时间
     */
    public static final String CONFIG_LONG_POLL_TIMEOUT = "configLongPollTimeout";

    /**
     * 配置重试时间
     */
    public static final String CONFIG_RETRY_TIME = "configRetryTime";

    /**
     * 最大重试
     */
    public static final String MAX_RETRY = "maxRetry";

    /**
     * 启用远程同步配置
     */
    public static final String ENABLE_REMOTE_SYNC_CONFIG = "enableRemoteSyncConfig";

    /**
     * naming启动时加载缓存
     */
    public static final String NAMING_LOAD_CACHE_AT_START = "namingLoadCacheAtStart";

    /**
     * naming缓存注册Dir
     */
    public static final String NAMING_CACHE_REGISTRY_DIR = "namingCacheRegistryDir";

    /**
     * naming客户端节拍线程数
     */
    public static final String NAMING_CLIENT_BEAT_THREAD_COUNT = "namingClientBeatThreadCount";

    /**
     * naming轮询线程数量
     */
    public static final String NAMING_POLLING_THREAD_COUNT = "namingPollingThreadCount";

    /**
     * naming请求域最大重试次数
     */
    public static final String NAMING_REQUEST_DOMAIN_RETRY_COUNT = "namingRequestDomainMaxRetryCount";

    /**
     * naming把空的保护
     */
    public static final String NAMING_PUSH_EMPTY_PROTECTION = "namingPushEmptyProtection";

    /**
     * push.receiver.udp.port
     */
    public static final String PUSH_RECEIVER_UDP_PORT = "push.receiver.udp.port";
    
    /**
     * 从系统属性中获取某个变量值的键值。
     */
    public static class SystemEnv {
        
        public static final String ALIBABA_ALIWARE_ENDPOINT_PORT = "ALIBABA_ALIWARE_ENDPOINT_PORT";
        
        public static final String ALIBABA_ALIWARE_NAMESPACE = "ALIBABA_ALIWARE_NAMESPACE";
        
        public static final String ALIBABA_ALIWARE_ENDPOINT_URL = "ALIBABA_ALIWARE_ENDPOINT_URL";
    }
    
}
