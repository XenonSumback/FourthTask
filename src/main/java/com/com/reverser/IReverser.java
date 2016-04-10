package com.com.reverser;

/**
 * Created by wolf on 03.04.16.
 *
 */
public interface IReverser {

    /**
     *
     * @param arr - array
     * @param <T> - type
     * @return -array of T
     */
     <T> T[] reverse(T[] arr);
}
