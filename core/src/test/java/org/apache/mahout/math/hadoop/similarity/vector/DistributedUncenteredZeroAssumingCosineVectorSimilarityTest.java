/**
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

package org.apache.mahout.math.hadoop.similarity.vector;

/**
 * tests {@link DistributedUncenteredZeroAssumingCosineVectorSimilarity}
 */
public class DistributedUncenteredZeroAssumingCosineVectorSimilarityTest
    extends DistributedVectorSimilarityTestCase {

  public void testUncenteredZeroAssumingCosine() throws Exception {
    assertSimilar(new DistributedUncenteredZeroAssumingCosineVectorSimilarity(),
        asVector(0, 0, 0, 0, 1),
        asVector(0, 1, 1, 1, 1), 5, 0.5d);

    assertSimilar(new DistributedUncenteredZeroAssumingCosineVectorSimilarity(),
        asVector(0, 1),
        asVector(1, 0), 2, Double.NaN);

    assertSimilar(new DistributedUncenteredZeroAssumingCosineVectorSimilarity(),
        asVector(1, 0),
        asVector(1, 0), 2, 1d);
  }
}