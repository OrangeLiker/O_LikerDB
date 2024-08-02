package org.Oliker.mydb.backend.common;

/**
 * @BelongsProject: O_LikerDB
 * @ClassName SubArray
 * @Description TODO
 * @Author WangZJ0908
 * @Date 2024/8/2
 * @Version: 1.0
 */
public class SubArray {
    public byte[] raw;
    public int start;
    public int end;

    public SubArray(byte[] raw, int start, int end) {
        this.raw = raw;
        this.start = start;
        this.end = end;
    }
}
