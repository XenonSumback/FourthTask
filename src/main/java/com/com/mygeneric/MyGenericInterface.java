package com.com.mygeneric;

/**
 * Created by wolf on 03.04.16.
 *
 */
public interface MyGenericInterface {

    /**
     *
     * @param arr - array
     * @param <T> - type
     * @return -array of T
     */
     <T> T[] reverse(T[] arr);
}
