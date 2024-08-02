package org.Oliker.mydb.backend.dm.pageIndex;

/**
 * @BelongsProject: O_LikerDB
 * @ClassName PageInfo
 * @Description TODO
 * @Author WangZJ0908
 * @Date 2024/8/2
 * @Version: 1.0
 */
public class PageInfo {
    public int pgno;
    public int freeSpace;

    public PageInfo(int pgno, int freeSpace) {
        this.pgno = pgno;
        this.freeSpace = freeSpace;
    }
}
