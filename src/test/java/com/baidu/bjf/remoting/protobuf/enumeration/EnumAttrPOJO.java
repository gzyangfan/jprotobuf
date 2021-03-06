/*
 * Copyright 2002-2007 the original author or authors.
 *
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
 */
package com.baidu.bjf.remoting.protobuf.enumeration;

import java.util.ArrayList;
import java.util.List;

import com.baidu.bjf.remoting.protobuf.EnumReadable;

/**
 * Enum pojo class.
 *
 * @author xiemalin
 * @since 1.4.0
 */
public enum EnumAttrPOJO implements EnumReadable {

    /** The string. */
    STRING(0), /** The int. */
    INT(1);

    /** The value. */
    private final int value;

    /**
     * Instantiates a new enum attr pojo.
     *
     * @param value the value
     */
    EnumAttrPOJO(int value) {
        this.value = value;
    }

    /**
     * To value.
     *
     * @return the int
     */
    public int toValue() {
        return this.value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.baidu.bjf.remoting.protobuf.Enumable#value()
     */
    public int value() {
        return toValue();
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        
        for (String string : list) {
            list.remove(string);
            System.out.println(list);
        }
    }
}
