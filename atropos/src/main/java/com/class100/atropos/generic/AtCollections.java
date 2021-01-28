package com.class100.atropos.generic;

import java.util.Collection;

public final class AtCollections extends AtAbilityAdapter {
    public static boolean isEmpty(Collection<?> c) {
        return c == null || c.size() < 1;
    }

    public static boolean isEmpty(Object[] arr) {
        return arr == null || arr.length < 1;
    }
}
