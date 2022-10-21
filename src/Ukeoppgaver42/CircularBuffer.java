package Ukeoppgaver42;

public class CircularBuffer {
    char [] buffer;
    int size;
    int head;
    int tail;
    int count;

    CircularBuffer(int size){ //konstruktør
        this.buffer=new char[size];
        this.size=size;
        this.head=0;
        this.tail=0;
        this.count=0;
    }

    void pushBack(char value){
        if(count+1>size){
            throw new IndexOutOfBoundsException();
        }
        buffer[tail]=value;
        tail=(tail+1) % size;
        count+=1;
    }

    char popfront() {
        char retval = buffer[head];
        System.out.print(head);
        head=(head+1) % size;
        count=count-1;
        return retval;
    }
    int count(){
        return count;
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(6);
        char[] values = "iuPISGV08GVywuevc".toCharArray();

        for (int i=0; i<values.length;){
            for (int j=0; j<3; j++){
                if (values.length>i+j){
                    buffer.pushBack(values[i+j]);
                }
            }

            while (buffer.count()>0){
                System.out.print(buffer.popfront());
            }
            System.out.println();

            i=i+3;
        }
    }
}
