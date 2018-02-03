package khlh.pipipou;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

@Disabled
public class FuncTest {
    private final Queue<DynamicTest> tests = new LinkedList<>();

    public void describe(String name, Executable test) {
        tests.add(DynamicTest.dynamicTest(name, test));
    }

    @TestFactory
    Stream<DynamicTest> tests() {
        return tests.stream();
    }
}
