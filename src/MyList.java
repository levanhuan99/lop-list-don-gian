import java.util.Arrays;


public class MyList<D> {
    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object[] object;

    public MyList() {
        object = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCap() {
        int newSize = object.length * 2;            //nhân đôi khả khả năng chứa phần tử lên 2 lần
        object = Arrays.copyOf(object, newSize);
    }

    public void add(D newFood) {                    //nếu size = độ dài của mảng thì gọi hàm ensureCap xong thêm phần tử
        if (size == object.length) {
            ensureCap();
        }
        object[size++] = newFood;


    }
    public D get (int i){
        if (i>=size || i<0){
            throw new IndexOutOfBoundsException("out of list");
        }
        return (D) object[i];
    }


}
