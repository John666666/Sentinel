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
package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Eric Zhao
 * @since 1.4.0
 */
@Component
@ConfigurationProperties(prefix = "sentinel.nacos")
public class NacosConfiguration {

    private String serverAddr = "localhost:8848";
    private String namespace = "";
    private String groupId = "SENTINEL_GROUP";

    // data id postfix
    private String flowDataIdPostfix = "-flow-rules";
    private String paramFlowDataIdPostfix = "-param-rules";
    private String clusterMapDataIdPostfix = "-cluster-map";

    // auth
    private boolean authEnabled = false;
    private String username = "nacos";
    private String password = "nacos";
    private String tokenTTL = "***";

    /**
     * cc for `cluster-client`
     */
    public static final String CLIENT_CONFIG_DATA_ID_POSTFIX = "-cc-config";
    /**
     * cs for `cluster-server`
     */
    public static final String SERVER_TRANSPORT_CONFIG_DATA_ID_POSTFIX = "-cs-transport-config";
    public static final String SERVER_FLOW_CONFIG_DATA_ID_POSTFIX = "-cs-flow-config";
    public static final String SERVER_NAMESPACE_SET_DATA_ID_POSTFIX = "-cs-namespace-set";

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getFlowDataIdPostfix() {
        return flowDataIdPostfix;
    }

    public void setFlowDataIdPostfix(String flowDataIdPostfix) {
        this.flowDataIdPostfix = flowDataIdPostfix;
    }

    public String getParamFlowDataIdPostfix() {
        return paramFlowDataIdPostfix;
    }

    public void setParamFlowDataIdPostfix(String paramFlowDataIdPostfix) {
        this.paramFlowDataIdPostfix = paramFlowDataIdPostfix;
    }

    public String getClusterMapDataIdPostfix() {
        return clusterMapDataIdPostfix;
    }

    public void setClusterMapDataIdPostfix(String clusterMapDataIdPostfix) {
        this.clusterMapDataIdPostfix = clusterMapDataIdPostfix;
    }

    public boolean isAuthEnabled() {
        return authEnabled;
    }

    public void setAuthEnabled(boolean authEnabled) {
        this.authEnabled = authEnabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTokenTTL() {
        return tokenTTL;
    }

    public void setTokenTTL(String tokenTTL) {
        this.tokenTTL = tokenTTL;
    }
}
