package fr.lbenoit.billets.codes_sources;

/*-
 * #%L
 * NullPointerExceptionHelpful
 * %%
 * Copyright (C) 2019 Lilian BENOIT
 * %%
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
 * #L%
 */

import org.junit.Test;

public class NullPointerExceptionHelpulTableauTest {

    @Test (expected=NullPointerException.class)
    public void testTableau() {
        try {
            int[][][] tab = new int[5][][];
            
            int i = 1;
            int j = 2;
            int k = 4;
            tab[i] = new int[5][];

            tab[i][j][k] = 25;
        } catch (NullPointerException e) {
            e.printStackTrace();
            throw e;
        }
    }

 
}
