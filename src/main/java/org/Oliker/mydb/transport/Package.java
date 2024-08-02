package org.Oliker.mydb.transport;

/**
 * @BelongsProject: O_LikerDB
 * @ClassName Package
 * @Description TODO
 * @Author WangZJ0908
 * @Date 2024/8/2
 * @Version: 1.0
 */
public class Package {
    byte[] data;
    Exception err;

    public Package(byte[] data, Exception err) {
        this.data = data;
        this.err = err;
    }

    public byte[] getData() {
        return data;
    }

    public Exception getErr() {
        return err;
    }
}
