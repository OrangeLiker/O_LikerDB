package org.Oliker.mydb.client;


import org.Oliker.mydb.transport.Package;
import org.Oliker.mydb.transport.Packager;

/**
 * @BelongsProject: O_LikerDB
 * @ClassName RoundTripper
 * @Description TODO
 * @Author WangZJ0908
 * @Date 2024/8/2
 * @Version: 1.0
 */
public class RoundTripper {
    private Packager packager;

    public RoundTripper(Packager packager) {
        this.packager = packager;
    }

    public Package roundTrip(Package pkg) throws Exception {
        packager.send(pkg);
        return packager.receive();
    }

    public void close() throws Exception {
        packager.close();
    }
}
