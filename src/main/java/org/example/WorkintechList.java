package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T>{

    public boolean add(T o){
        if(!contains(o)){
            return super.add(o);
        }
            return false;
        }

        public void sort(){
            super.sort(null);
        }

        public boolean remove(T o){
        boolean removed = super.remove(o);
        if(removed){
            sort();
        }
        return removed;
        }

    }

