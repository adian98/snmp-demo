package demo;

import java.io.IOException;

/**
 * @Auther: cpb
 * @Date: 2019/1/24 10:45
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        SnmpService snmpService = new SnmpService();
        SnmpModel snmpModel = new SnmpModel();
        snmpModel.setIp("127.0.0.1");
        snmpModel.setCommunityName("public");
        snmpModel.setHostIp("127.0.0.1");
        snmpModel.setPort(161);
        snmpModel.setVersion(1);
        try {
            //是否连接
            System.out.println("是否连接："+snmpService.isEthernetConnection(snmpModel));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("cpu利用率："+ snmpService.getCpuUtilization(snmpModel));
        System.out.println("内存使用率："+ snmpService.getMemoryUtilization(snmpModel));

    }
}
