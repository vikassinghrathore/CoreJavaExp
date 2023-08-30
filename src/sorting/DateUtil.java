package sorting;

import java.io.Serializable;

public class DateUtil implements Cloneable, Serializable {
    private volatile static DateUtil instance;
    private DateUtil() {
    //no operations
    }
    public static DateUtil getInstance() {
        if(instance==null) {
            synchronized (DateUtil.class) {
                System.out.println("locked......");
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }
    protected Object Clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    protected  Object readResolve(){
        return  instance;
    }
}
