package com.company;

import java.util.Arrays;

public class DonList<T> {

	private T[] values;
	private int firstFreeIndex; // this is equal to the length of tha values

	public DonList() {
		this.values = (T[]) new Object[10];
		this.firstFreeIndex = 0;
	}

	public void add(T value) {
		// if the array is full i.e
		if(this.values.length == this.firstFreeIndex) {
			grow();
		}
		this.values[this.firstFreeIndex] = value;
		this.firstFreeIndex++;
	}

	private void grow() {
		// increase the size of the array
		int newSize = this.firstFreeIndex + this.firstFreeIndex / 2;

		// create a new array with the new size
		T[] newValues = (T[]) new Object[newSize];

		// copy the values of old array into new one
		for(int i =0; i < this.firstFreeIndex; i++) {
			newValues[i] = this.values[i];
		}
		this.values = newValues;
	}

	public void remove(T value) {
		// find the index of value in the array
		int indexOfValue = indexOfValue(value);
		if(indexOfValue < 0) {
			return;
		}

		// if found replace the element by element from the right
		moveToLeft(indexOfValue);

		// remove the last element
		this.firstFreeIndex--;
	}

	// gets the index of value passed in the parameter or return -1
	private int indexOfValue(T value) {
		for(int i = 0; i < this.firstFreeIndex; i++) {
			if(value.equals(this.values[i])) {
				return i;
			}
		}
		return -1;
	}

	private void moveToLeft(int fromIndex) {
		for(int i = fromIndex; i < this.firstFreeIndex - 1; i++ ) {
			this.values[i] = this.values[i+1];
		}
	}

	@Override
	public String toString() {
		return "MyList{" +
			"values=" + Arrays.toString(values) +
			", firstFreeIndex=" + firstFreeIndex +
			'}';
	}
}
