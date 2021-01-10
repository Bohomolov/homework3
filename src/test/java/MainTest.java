import main.Main;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MainTest {
    Main main;
    public MainTest(){
        main = new Main();
    }
    static Stream<Arguments> shotDistanceTest(){
        return Stream.of(
             arguments(0.0,0.0,0.0),
             arguments(1.0,0.0,0.0),
             arguments(1.0,1.0,0.0035575429870031566),
             arguments(100.0,100.0,-348.64438667244514),
             arguments(20.0,45.0,40.774_719_673_802_24)
        );
    }
    @ParameterizedTest(name = "Shot distance. Input data {0}, {1}")
    @MethodSource("shotDistanceTest")
    void shotDistanceTest_1(double speed, double angle, double expected){
        double actual = main.shotDistance(speed,angle);
        assertEquals(expected,actual);
    }

}
