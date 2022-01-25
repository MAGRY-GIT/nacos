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

package com.alibaba.nacos.api.cmdb.spi;

import com.alibaba.nacos.api.cmdb.pojo.Entity;
import com.alibaba.nacos.api.cmdb.pojo.EntityEvent;
import com.alibaba.nacos.api.cmdb.pojo.Label;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 访问 CMDB 商店的服务。
 *
 * @author nkorange
 * @since 0.7.0
 */
public interface CmdbService {

    /**
     * 获取存储在CMDB中的所有标签名称。
     *
     * @return label name set
     */
    Set<String> getLabelNames();

    /**
     * 获取CMDB中所有可能的实体类型。
     *
     * @return all entity types
     */
    Set<String> getEntityTypes();

    /**
     * 标签信息。
     *
     * @param labelName label name
     * @return label info
     */
    Label getLabel(String labelName);

    /**
     * 获取ip的标签名的标签值。
     *
     * @param entityName entity name
     * @param entityType entity type
     * @param labelName  target label name
     * @return label value
     */
    String getLabelValue(String entityName, String entityType, String labelName);

    /**
     * 获取ip的所有标签值。
     *
     * @param entityName entity name
     * @param entityType entity type
     * @return all label values
     */
    Map<String, String> getLabelValues(String entityName, String entityType);

    /**
     * Dump all entities in CMDB.
     *
     * @return all entities
     */
    Map<String, Map<String, Entity>> getAllEntities();

    /**
     * 获取标签更改事件。
     *
     * @param timestamp start time of generated events
     * @return label events
     */
    List<EntityEvent> getEntityEvents(long timestamp);

    /**
     * 得到单一的实体。
     *
     * @param entityName name of entity
     * @param entityType type of entity
     * @return entity.
     */
    Entity getEntity(String entityName, String entityType);
}
