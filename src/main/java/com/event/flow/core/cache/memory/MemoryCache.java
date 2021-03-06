/* Copyright 2013-2015 www.snakerflow.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.event.flow.core.cache.memory;



import com.event.flow.core.cache.Cache;
import com.event.flow.core.cache.CacheException;
import com.event.flow.core.helper.AssertHelper;

import java.util.Map;


public class MemoryCache<K, V> implements Cache<K, V> {
	/**
	 * map cache
	 */
	private final Map<K, V> map;
	/**
	 * 通过Map实现类构造MemoryCache
	 * @param backingMap
	 */
	public MemoryCache(Map<K, V> backingMap) {
		AssertHelper.notNull(backingMap);
		this.map = backingMap;
	}
	
	public V get(K key) throws CacheException {
		return map.get(key);
	}

	public V put(K key, V value) throws CacheException {
		return map.put(key, value);
	}

	public V remove(K key) throws CacheException {
		return map.remove(key);
	}

	public void clear() throws CacheException {
		map.clear();
	}
}
