package models;

import java.util.ArrayList;
import java.util.List;

public class AdHoc {

    public List<MD> contactList = new ArrayList<MD>();

    public void refreshContactSet(){
        //Calculate TCS and reset current contact set
    };

    public int getTCSSize(){return contactList.size();}

    public MD selectMD(){
        if(contactList.size() == 0) return null;
        MD max = contactList.get(0);

        for(MD md : contactList){
            if(md.capacity > max.capacity) max = md;
        }

        return max;
    }

}
