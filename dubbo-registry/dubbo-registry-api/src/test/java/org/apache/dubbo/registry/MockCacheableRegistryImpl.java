/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.registry;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.registry.support.CacheableFailbackRegistry;

/**
 *
 */
public class MockCacheableRegistryImpl extends CacheableFailbackRegistry {

    public MockCacheableRegistryImpl(URL url) {
        super(url);
    }

    @Override
    public int getDelay() {
        return 0;
    }

    @Override
    protected boolean isMatch(URL subscribeUrl, URL providerUrl) {
        return false;
    }

    @Override
    public void doRegister(URL url) {

    }

    @Override
    public void doUnregister(URL url) {

    }

    @Override
    public void doSubscribe(URL url, NotifyListener listener) {

    }

    @Override
    public void doUnsubscribe(URL url, NotifyListener listener) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}