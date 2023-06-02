/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.curator.x.discovery;

/**
 * Constructs ZooKeeper paths to services for service discovering.
 */
public interface DiscoveryPathConstructor {
    /**
     * Return the path where all service names registered.
     *
     * @return the base path of all services
     */
    String getBasePath();

    /**
     * Return the path where all instances of the service registered.
     *
     * @param serviceName service name
     * @return  path to service instances
     */
    String getPathForInstances(String serviceName);

    /**
     * Return the path where specified instance registered.
     *
     * @param serviceName service name
     * @param instanceId instance id
     * @return path to concrete instance
     */
    String getPathForInstance(String serviceName, String instanceId);
}
