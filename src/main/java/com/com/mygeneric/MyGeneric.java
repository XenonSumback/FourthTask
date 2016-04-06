package com.com.mygeneric;

/**
 * Class for reversing arrays
 * @param <T> -type
 */
public class MyGeneric<T> implements MyGenericInterface {

    /**
     * default constructor
     * @param arr - array
     */
    public MyGeneric(final T[] arr) {
    }

    /**
     *
     * @param arr - array
     * @param <T> - type of array
     * @return arr - reversed array
     */

    public <T> T[] reverse(final T[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            T tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }
}