import java.util.ArrayList;
import java.util.List;

// Class Deque berikut merupakan suatu kelas Generic yang merepresentasikan suatu Deque.
// Deque merupakan suatu struktur data yang mirip dengan Queue, namun Deque memiliki dua ujung, yaitu front dan back.
// Deque disimpan dengan memanfaatkan ArrayList.
// Elemen front pada Deque disimpan pada indeks paling kiri, sedangkan elemen back disimpan pada indeks paling kanan.
public class Deque<T> {

  private List<T> data;

  private int lastElmIdx, size;

  private final static int DEFAULT_Deque_SIZE = 500;


  //Constructor dengan size default
  public Deque(){
    this(DEFAULT_Deque_SIZE);
  }

  //Constructor dengan size = n
  public Deque(int n){
    this.data = new ArrayList<T>(n);
    this.size = n;
    this.lastElmIdx = -1;
  }

  //Copy Constructor dari Deque lain
  public Deque(final Deque<T> q){
    this.data = new ArrayList<T>(q.size);
    this.size = q.size;
    this.lastElmIdx = q.lastElmIdx;
    for(int i = 0; i <= q.lastElmIdx; i++){
      this.data.add(q.data.get(i));
    }
  }

  //Method untuk menambahkan elemen pada ujung front Deque
  //Jika Deque penuh, lempar exception "Deque is full"
  public void pushFront(T t) throws Exception{
    if(isFull()){
      throw new Exception("Deque is full");
    }
    this.data.add(0, t);
    this.lastElmIdx++;
  }

  //Method untuk menambahkan elemen pada ujung back Deque
  //Jika Deque penuh, lempar exception "Deque is full"
  public void pushBack(T t) throws Exception{
    if(isFull()){
      throw new Exception("Deque is full");
    }
    this.data.add(t);
    this.lastElmIdx++;
  }

  //Method untuk menghapus elemen pada ujung front Deque
  //Jika Deque kosong, lempar exception "Deque is empty"
  public T popFront() throws Exception{
    if(isEmpty()){
      throw new Exception("Deque is empty");
    }
    T t = this.data.get(0);
    this.data.remove(0);
    this.lastElmIdx--;

    return t;
  }

  //Method untuk menghapus elemen pada ujung back Deque
  //Jika Deque kosong, lempar exception "Deque is empty"
  public T popBack() throws Exception{
    if(isEmpty()){
      throw new Exception("Deque is empty");
    }
    T t = this.data.get(this.lastElmIdx);
    this.data.remove(this.lastElmIdx);
    this.lastElmIdx--;

    return t;
  }

  //Method untuk membalikkan urutan elemen pada Deque
  public void reverse() {
    int i = 0;
    int j = this.lastElmIdx;
    while(i < j){
      T temp = this.data.get(i);
      this.data.set(i, this.data.get(j));
      this.data.set(j, temp);
      i++;
      j--;
    }
  }

  //Method untuk mengecek apakah Deque kosong
  public boolean isEmpty(){
    return this.lastElmIdx == -1;
  }

  //Method untuk mengecek apakah Deque penuh
  public boolean isFull(){
    return this.lastElmIdx == this.size - 1;
  }

  //Method untuk mendapatkan ukuran Deque
  public int size(){
    return this.lastElmIdx + 1;
  }

}