package hu.zskf.common;

public class ZskfException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ZskfException(String message) {
	super(message);
	Log.saveLog(LogData.builder().message(message).build());
    }
}
