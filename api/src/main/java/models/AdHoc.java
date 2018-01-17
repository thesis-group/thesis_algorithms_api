package models;

import modules.RL;

import java.util.ArrayList;
import java.util.List;

public class AdHoc {

    public List<MDSet> contactList = new ArrayList<MDSet>();

    public final static double threshold = 0.3;

    public AdHoc(List<MDSet> contactList){
        List<MDSet> filtered = new ArrayList<MDSet>();
        for(MDSet mdSet : contactList){
            if(canContact(RL.calculateContactRate(mdSet))){
                filtered.add(mdSet);
            }
        }

        this.contactList = filtered;

    }

    public boolean existContactableNodes(){
        return contactList.size() > 0;
    }

    public MDSet selectMDSet(){
        if(contactList.size() == 0) return null;
        MDSet max = contactList.get(0);

        for(MDSet mdSet : contactList){
            if(mdSet.md.capacity > max.md.capacity) max = mdSet;
        }

        return max;
    }

    public boolean canContact(double rate){
        return rate >= threshold;
    }

}
