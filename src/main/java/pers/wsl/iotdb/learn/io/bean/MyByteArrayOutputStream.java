package pers.wsl.iotdb.learn.io;

import java.io.ByteArrayOutputStream;

public class MyByteArrayOutputStream extends ByteArrayOutputStream {
    public byte[] getBuf(){
        return super.buf;
    }
}
