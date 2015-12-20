package nfc;

import nfc.NfcDataType.*;

/**
 * Created by L on 2015/12/14.
 */
public class NfcTestData {
	NfcDataType nfcDataType;

	public REQInf reqInf ;
	public ItemInf itemInf;
	public TransInf transInf;
	public ConsInf consInf;
	public UID uid;

	public NfcTestData() {
		nfcDataType = new NfcDataType();
		reqInf = nfcDataType.new REQInf("E00000000000000000000000","2015-REQ-001","申请人A","施工队B","复查人C",Long.decode("1450081000"));
		itemInf = nfcDataType.new ItemInf("E00000000","C000001",10,Long.decode("1450070000"));
		transInf =nfcDataType.new TransInf("运输人D","广州和新","河南省平顶山市神马大道",33.7720510000,113.1989350000,Long.decode("1450086000"));
		consInf = nfcDataType.new ConsInf("工作人员E","河南省平顶山市神马大道施工","广州和新",33.7720510000,113.1989350000,Long.decode("1450070000"));
		uid = nfcDataType.new UID("E1E2E3E4");
	}
}
