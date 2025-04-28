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
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be positive");
        }
        if (modules == null || modules.isEmpty()) {
            return new ArrayList<>();
        }
        
        List<Integer> sortedModules = new ArrayList<>(modules);
        Collections.sort(sortedModules, Collections.reverseOrder());  // BIGGER modules first
    
        List<List<Integer>> results = new ArrayList<>();
        findCombinations(width, sortedModules, new ArrayList<>(), results);
        return results;
    }

    private void findCombinations(int remainingWidth, List<Integer> modules, List<Integer> currentCombination, List<List<Integer>> results) {
        if (remainingWidth == 0) {
            results.add(new ArrayList<>(currentCombination));
            return;
        }
        for (int module : modules) {
            if (module <= remainingWidth) {
                currentCombination.add(module);
                findCombinations(remainingWidth - module, modules, currentCombination, results);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }
}


