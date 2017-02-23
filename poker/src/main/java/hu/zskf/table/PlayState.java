package hu.zskf.table;

import hu.zskf.card.Board;
import hu.zskf.common.enums.Street;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PlayState {
	private Board board;
	private Street street;
}
