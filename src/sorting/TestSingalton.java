package sorting;

import java.lang.reflect.Constructor;

public class TestSingalton {
    public static void main(String[] args) {
       DateUtil d1=DateUtil.getInstance();
        DateUtil d2=DateUtil.getInstance();
        System.out.println("hashCode : " + d1.hashCode());
        System.out.println("hashCode :" + d2.hashCode());

        //reflection apis
        DateUtil object1 = DateUtil.getInstance();
        DateUtil object2 = null;
        try
        {
            Constructor[] constructors = DateUtil.class.getDeclaredConstructors();
            for (Constructor constructor : constructors)
            {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                object2 = (DateUtil) constructor.newInstance();
                break;
            }
        }catch (Exception e)
        {e.printStackTrace();}
        System.out.println("object1 .hashCode():- " + object1.hashCode());
        System.out.println("object2.hashCode():- " + object2.hashCode());
    }
}