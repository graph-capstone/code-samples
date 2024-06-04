package org.example.unittest;

import java.util.ArrayList;
import java.util.List;

public class Deque<T> {

  private List<T> data;

  private int lastElmIdx, size;

  private final static int DEFAULT_Deque_SIZE = 500;

  public Deque() {
    this(DEFAULT_Deque_SIZE);
  }

  public Deque(int n) {
    this.data = new ArrayList<T>(n);
    this.size = n;
    this.lastElmIdx = -1;
  }

  public Deque(final Deque<T> q) {
    this.data = new ArrayList<T>(q.size);
    this.size = q.size;
    this.lastElmIdx = q.lastElmIdx;
    for (int i = 0; i <= q.lastElmIdx; i++) {
      this.data.add(q.data.get(i));
    }
  }

  public void pushFront(T t) throws Exception {
    if (isFull()) {
      throw new Exception("Deque is full");
    }
    this.data.add(0, t);
    this.lastElmIdx++;
  }

  public void pushBack(T t) throws Exception {
    if (isFull()) {
      throw new Exception("Deque is full");
    }
    this.data.add(t);
    this.lastElmIdx++;
  }

  public T popFront() throws Exception {
    if (isEmpty()) {
      throw new Exception("Deque is empty");
    }
    T t = this.data.get(0);
    this.data.remove(0);
    this.lastElmIdx--;

    return t;
  }

  public T popBack() throws Exception {
    if (isEmpty()) {
      throw new Exception("Deque is empty");
    }
    T t = this.data.get(this.lastElmIdx);
    this.data.remove(this.lastElmIdx);
    this.lastElmIdx--;

    return t;
  }

  public void reverse() {
    int i = 0;
    int j = this.lastElmIdx;
    while (i < j) {
      T temp = this.data.get(i);
      this.data.set(i, this.data.get(j));
      this.data.set(j, temp);
      i++;
      j--;
    }
  }

  public boolean isEmpty() {
    return this.lastElmIdx == -1;
  }

  public boolean isFull() {
    return this.lastElmIdx == this.size - 1;
  }

  public int size() {
    return this.lastElmIdx + 1;
  }
}