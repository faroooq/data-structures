package com.data.arrays;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        this.items = new int[length];
    }

    public void print() {
        /*
         * count - To keep track of number of items in the array.
         */
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        /*
         * Below logic performs SHIFT OPERATION.
         * Shift the items to the left to fill the hole or gap.
         * [10, 30, 40, 60]
         * If the input is to remove the 1st index, then
         * [10, 40, 60]
         */
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        /*
         * We are making count--, means removing the last index which
         * doesn't have any value.
         */
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i; // return the index of the item not the value.
            }
        }
        return -1;
    }

}