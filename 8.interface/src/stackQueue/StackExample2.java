package stackQueue;

import java.util.stream.IntStream;

interface IStack {
    int length();
    Object pop();
    boolean push(Object ob);
    Object peek();
    boolean isEmpty();
}

class StackExample2 implements IStack {

    private Object[] bucket;
    private int length;

    StackExample2() {
        bucket = new Object[5];
        length = 0;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        if (length < bucket.length / 3) {
            reduceBucket();
        }
        length -= 1;
        return bucket[length];
    }

    @Override
    public boolean push(Object data) {
        if (isBucketFull()) {
            extendBucket();
        }
        bucket[length] = data;
        length += 1;
        return true;
    }

    private boolean isBucketFull() {
        return length == bucket.length;
    }

    private void extendBucket() {
        copyBucket(new Object[bucket.length * 2]);
    }

    private void reduceBucket() {
        copyBucket(new Object[bucket.length / 2]);
    }

    private void copyBucket(Object[] newBucket) {
        System.arraycopy(bucket, 0, newBucket, 0, length);
        bucket = newBucket;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return bucket[length - 1];
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }
}

class StackExample {
    public static void main(String[] args) {
        IStack stack = new Stack();
        IntStream.rangeClosed(1, 10).forEach(stack::push);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}