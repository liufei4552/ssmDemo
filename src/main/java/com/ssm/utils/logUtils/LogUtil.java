package com.ssm.utils.logUtils;

import org.apache.log4j.Logger;

public class LogUtil {

   /* private static Logger playerLogger = Logger.getLogger("playerLog");*/
    /**
     * 后台日志输出
     */
    private static Logger gmLogger = Logger.getLogger("gmLog");
	/**
	 * 后台错误日志错误
	 */
	private static Logger systemerror=Logger.getLogger("systemError");
   /* public static void getPlayerLog(String log) {

        playerLogger.info(log);
    }*/

    public static void getGMLog(String log) {
        gmLogger.info(log);
    }

	public static  void getError(Exception e) {
		systemerror.error(e);
	}
	public static  void getSystemError(String str) {
		systemerror.error(str);
	}
}
