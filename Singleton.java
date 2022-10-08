/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolateboilerproject;

/**
 *
 * @author guilh
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

private Singleton () {}
    public static Singleton getInstance () {
        Singleton uniqueInstance = Singleton.uniqueInstance;
            if (uniqueInstance == null) {
                    synchronized(Singleton.class){
                uniqueInstance = Singleton.uniqueInstance;
                            if(uniqueInstance==null){
                    Singleton.uniqueInstance=uniqueInstance = new Singleton();
    }
                    }
    }
    return uniqueInstance;
    }
}
