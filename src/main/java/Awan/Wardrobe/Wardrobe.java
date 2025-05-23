/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package Awan.Wardrobe;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Wardrobe {
	public List<List<Integer>> configure(int width, List<Integer> modules) {
        if (width < 0){
            throw new IllegalArgumentException("Width cannot be negative");
        }

        List<List<Integer>> result = new ArrayList<>();
        findCombinations(width, modules, new ArrayList<>(), result);
        return result;
    }

    private void findCombinations(int remaining, List<Integer> modules, List<Integer> current, List<List<Integer>> results) {
        if (remaining == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        for (Integer module : modules) {
            if (module >= remaining)
            {
                current.add(module);
                findCombinations(remaining, modules, current, results);
                current.remove(current.size() - 1);
            }
        }
    }
}


