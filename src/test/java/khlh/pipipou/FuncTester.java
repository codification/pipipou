package khlh.pipipou;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.DynamicTest.*;

@Disabled
public class FuncTester {

    public static Stream<DynamicTest> tests(DynamicTest... tests) {
        return Arrays.stream(tests);
    }

    public static DynamicTest describe(String name, Executable test) {
        return dynamicTest(name, test);
    }
}
