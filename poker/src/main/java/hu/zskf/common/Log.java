package hu.zskf.common;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log {
    public static void saveLog(LogData logData) {
	Logger logger;

	if (logData.getSource() == null) {
	    logger = Logger.getLogger(Log.class);
	} else {
	    logger = Logger.getLogger(logData.getClass());
	}

	Level level = Level.INFO;
	if (logData.getLevel() != null) {
	    level = logData.getLevel();
	}

	if (level == Level.WARN) {
	    logger.warn(logData);
	} else if (level == Level.ERROR) {
	    logger.error(logData);
	} else if (level == Level.DEBUG) {
	    logger.debug(logData);
	} else {
	    logger.info(logData);
	}
    }
}
