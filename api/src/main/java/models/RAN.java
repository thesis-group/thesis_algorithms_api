package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RAN {

    //Singleton
    static RAN ran;

    Map<Integer, AP> apMap; //默认AP与对应区域编号相同，例如0号AP即表示0号区域
    int[][] apConn;

    private RAN(Map<Integer, AP> apMap, int[][] apConn){
        this.apMap = apMap;
        this.apConn = apConn;
    }

    public static RAN getInstance(){
        return ran;
    }

    public static void initRAN(Map<Integer, AP> apMap, int[][] apConn){
        ran = new RAN(apMap, apConn);
    }

    public int getMDCount(int i){
        return apMap.get(i).mdCount;
    }

    public AP[] connected(int i){
        List<AP> zones = new ArrayList<AP>();

        for(int j = 0; j<apConn[i].length; j++){
            if(apConn[i][j] == 1) {
                zones.add(apMap.get(j));
            }
        }

        AP[] result = new AP[zones.size()];
        return zones.toArray(result);
    }


}
