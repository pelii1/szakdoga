package hu.zskf.common;

import org.apache.log4j.Level;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LogData {
    private Object source;
    private String message;
    private Level level;

    @Override
    public String toString() {
	return getMessage();
    }

}
