package threadfor.netty;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by Administrator on 2019/3/30 0030.
 */
public class RequestInfo implements Serializable {

    private String ip ;
    private HashMap<String, Object> cpuPercMap ;
    private HashMap<String, Object> memoryMap;
    //.. other field

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public HashMap<String, Object> getCpuPercMap() {
        return cpuPercMap;
    }
    public void setCpuPercMap(HashMap<String, Object> cpuPercMap) {
        this.cpuPercMap = cpuPercMap;
    }
    public HashMap<String, Object> getMemoryMap() {
        return memoryMap;
    }
    public void setMemoryMap(HashMap<String, Object> memoryMap) {
        this.memoryMap = memoryMap;
    }


}