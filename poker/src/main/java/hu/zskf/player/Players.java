package hu.zskf.player;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Players {
	@Getter
	private final List<Player> players = new ArrayList<Player>();
	
	public int count() {
		return getPlayers().size();
	}

}
