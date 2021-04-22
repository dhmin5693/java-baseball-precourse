package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomNumbersGenerator implements NumbersGenerator {

    private static final int MAX_SIZE_OF_NUMBERS = 3;

    private final RandomNumberGenerator randomNumberGenerator;

    public RandomNumbersGenerator(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    @Override
    public List<Integer> makeNumbers() {

        Set<Integer> set = new HashSet<>();

        while(set.size() < MAX_SIZE_OF_NUMBERS) {
            set.add(randomNumberGenerator.nextInt());
        }

        return Collections.unmodifiableList(new ArrayList<>(set));
    }
}
