package lotto.strategy;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class LottoNumberStrategyImpl implements LottoNumberStrategy {

    public List<Integer> generate() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }

}
