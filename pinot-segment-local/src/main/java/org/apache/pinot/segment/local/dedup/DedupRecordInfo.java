/**
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
package org.apache.pinot.segment.local.dedup;

import org.apache.pinot.spi.data.readers.PrimaryKey;


public class DedupRecordInfo {
  private final PrimaryKey _primaryKey;
  private final double _dedupTime;

  public DedupRecordInfo(PrimaryKey primaryKey, double dedupTime) {
    _primaryKey = primaryKey;
    _dedupTime = dedupTime;
  }

  public DedupRecordInfo(PrimaryKey primaryKey) {
    this(primaryKey, Double.MIN_VALUE);
  }

  public PrimaryKey getPrimaryKey() {
    return _primaryKey;
  }

  public double getDedupTime() {
    return _dedupTime;
  }
}