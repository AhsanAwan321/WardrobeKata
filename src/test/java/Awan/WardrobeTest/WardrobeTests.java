/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package Awan.WardrobeTest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled; 
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Awan.Wardrobe.Wardrobe;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class WardrobeTests {
	
	@Test
	@Disabled
	public void testEmptyWidthSize(){
		Wardrobe wardrobe = new Wardrobe();
        List<List<Integer>> result = wardrobe.configure(100, Collections.emptyList());
        assertTrue(result.isEmpty());
	}

	@Test
	@Disabled
    public void testSingleExactMatch() {
        Wardrobe wardrobe = new Wardrobe();
        List<List<Integer>> result = wardrobe.configure(100, Arrays.asList(50, 75, 100));
        assertTrue(result.stream().anyMatch(list -> list.equals(Arrays.asList(100))));
    }
		
	}

