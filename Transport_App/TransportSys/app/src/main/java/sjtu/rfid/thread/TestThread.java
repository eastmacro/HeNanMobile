package sjtu.rfid.thread;

import android.os.Handler;
import android.os.Message;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import rfid.service.POS;
import rfid.service.RFIDService;

/**
 * Created by shao on 2015/12/10.
 */
public class TestThread extends Thread{


    private double lng;
    private double lat;
    private String result="";
    private Handler handler;

    public TestThread(double lng,double lat,Handler handler){
        this.lat=lat;
        this.lng=lng;
        this.handler=handler;
    }
    public TestThread(Handler handler){
        this.handler=handler;
    }

    @Override
    public void run() {
        Message msg = handler.obtainMessage();
//        try{
////            TimeoutThread timeoutThread=new TimeoutThread(5000);
////            timeoutThread.SetHandler(handler);
////            timeoutThread.start();
//
//            msg.obj="1111";
//            handler.sendMessage(msg);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        try{

            // 设置调用的服务地址为本地，端口为 7777
            System.out.println("1111111111");
            TTransport transport = new TSocket("192.168.1.178", 7777);
            System.out.println("1111111111");
            transport.open();
            System.out.println("1111111111");
            // 设置传输协议为 TBinaryProtocol
            TProtocol protocol = new TBinaryProtocol(transport);
            RFIDService.Client client = new RFIDService.Client(protocol);
            String s = client.getApplyDocCodeByCNum("123");
            System.out.println("#"+s+"#");
            transport.close();
            msg.obj="#"+s+"#";
            System.out.println(msg.obj.toString());
            handler.sendMessage(msg);
            System.out.println(msg.obj.toString());
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}
