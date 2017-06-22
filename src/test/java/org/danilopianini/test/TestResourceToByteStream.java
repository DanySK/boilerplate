package org.danilopianini.test;
/*******************************************************************************
 * Copyright (C) 2009, 2015, Danilo Pianini and contributors
 * listed in the project's build.gradle or pom.xml file.
 *
 * This file is distributed under the terms of the Apache License, version 2.0
 *******************************************************************************/

import org.danilopianini.util.stream.Streams;
import org.junit.Assert;
import org.junit.Test;

/**
 */
public class TestResourceToByteStream {

    /**
     * 
     */
    @Test
    public void test() {
        Streams.fileToByteStream(Streams.class.getResource("/randombinaryfile"), e -> Assert.fail())
            .forEach(b -> Assert.assertTrue(b instanceof Byte));
        Streams.fileToByteStream(Streams.class.getResource("/randombinaryfile1K"), e -> Assert.fail())
            .forEach(b -> Assert.assertTrue(b instanceof Byte));
    }

}
