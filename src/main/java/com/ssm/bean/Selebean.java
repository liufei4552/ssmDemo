package com.ssm.bean;

/**
 * 为了便于条件查询实体类
 */
public class Selebean {
	private String startTime;//开始时间
	private String endTime;//结束时间
	private int num;//参数1
	private long num1;//参数2
	private long num3;//参数3
	private int num4;//参数4
	private Page page;//分页
	private String str1;//字符换参数1
	private String str2;//字符换参数2
	private String str3;//字符换参数3
	private String str4;//字符换参数4
	private int idLogin;//玩家id
	private String channelName;//渠道名称
	private String channelNickname;//渠道昵称
	private String nickname;//玩家昵称
	private double timeRealAmount;//时间段内充值
	private double realAmount;//总充值
	private long timeLottery;//时间段内获得兑换券
	private long lottery;//获得总兑换券
	private long timeGold;//时间段内获得黄金弹头
	private long gold;//获得总黄金弹头
	private int channelid;//渠道
	private String database;//数据库名字

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public int getChannelid() {
		return channelid;
	}

	public void setChannelid(int channelid) {
		this.channelid = channelid;
	}

	public String getChannelNickname() {
		return channelNickname;
	}

	public void setChannelNickname(String channelNickname) {
		this.channelNickname = channelNickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public double getTimeRealAmount() {
		return timeRealAmount;
	}

	public void setTimeRealAmount(double timeRealAmount) {
		this.timeRealAmount = timeRealAmount;
	}

	public double getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(double realAmount) {
		this.realAmount = realAmount;
	}

	public long getTimeLottery() {
		return timeLottery;
	}

	public void setTimeLottery(long timeLottery) {
		this.timeLottery = timeLottery;
	}

	public long getLottery() {
		return lottery;
	}

	public void setLottery(long lottery) {
		this.lottery = lottery;
	}

	public long getTimeGold() {
		return timeGold;
	}

	public void setTimeGold(long timeGold) {
		this.timeGold = timeGold;
	}

	public long getGold() {
		return gold;
	}

	public void setGold(long gold) {
		this.gold = gold;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public int getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String getStr3() {
		return str3;
	}

	public void setStr3(String str3) {
		this.str3 = str3;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public long getNum1() {
		return num1;
	}

	public void setNum1(long num1) {
		this.num1 = num1;
	}

	public long getNum3() {
		return num3;
	}

	public void setNum3(long num3) {
		this.num3 = num3;
	}

	public int getNum4() {
		return num4;
	}

	public void setNum4(int num4) {
		this.num4 = num4;
	}

	public String getStr4() {
		return str4;
	}

	public void setStr4(String str4) {
		this.str4 = str4;
	}

	public Selebean(String startTime, String endTime, int num, long num1, long num3, int num4) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.num = num;
		this.num1 = num1;
		this.num3 = num3;
		this.num4 = num4;
	}

	public Selebean(int num, int num4, int idLogin) {
		this.num = num;
		this.num4 = num4;
		this.idLogin = idLogin;
	}

	public Selebean(String startTime, String endTime, Page page, int idLogin) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.page = page;
		this.idLogin = idLogin;
	}

	public Selebean(String startTime, String endTime, int num, Page page, int idLogin, String channelName) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.num = num;
		this.page=page;
		this.idLogin=idLogin;
		this.channelName=channelName;
	}

	public Selebean(String startTime, String endTime, Page page, String channelName) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.page = page;
		this.channelName = channelName;
	}

	public Selebean() {
		super();
	}

	@Override
	public String toString() {
		return "Selebean{" +
				"startTime='" + startTime + '\'' +
				", endTime='" + endTime + '\'' +
				", num=" + num +
				", num1=" + num1 +
				", num3=" + num3 +
				", num4=" + num4 +
				", page=" + page +
				", str1='" + str1 + '\'' +
				", str2='" + str2 + '\'' +
				", str3='" + str3 + '\'' +
				", idLogin=" + idLogin +
				'}';
	}
}
