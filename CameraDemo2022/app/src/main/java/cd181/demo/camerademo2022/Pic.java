package cd181.demo.camerademo2022;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Pic extends RealmObject {
    @PrimaryKey
    private String uuid;

    private String path;


    public Pic() {}


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "uuid='" + uuid + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
