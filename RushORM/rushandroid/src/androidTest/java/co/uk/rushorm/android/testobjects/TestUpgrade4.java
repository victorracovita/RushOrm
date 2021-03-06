package co.uk.rushorm.android.testobjects;

import java.util.List;

import co.uk.rushorm.core.RushObject;
import co.uk.rushorm.core.annotations.RushList;
import co.uk.rushorm.core.annotations.RushRenamed;

/**
 * Created by Stuart on 18/12/14.
 */
@RushRenamed(names = {"co.uk.rushorm.android.testobjects.TestBase1"})
public class TestUpgrade4 extends RushObject {
    @RushRenamed(names = {"stringField"})
    public String stringFieldNamed;
    @RushRenamed(names = {"doubleField"})
    public double doubleFieldNamed;
    @RushRenamed(names = {"intField"})
    public int intFieldNamed;
    @RushRenamed(names = {"longField"})
    public long longFieldNamed;
    @RushRenamed(names = {"shortField"})
    public short shortFieldNamed;
    @RushRenamed(names = {"booleanField"})
    public boolean booleanFieldNamed;
    @RushRenamed(names = {"testBase2"})
    public TestUpgrade5 testUpgrade5;
    @RushRenamed(names = {"testBase2List"})
    @RushList(classType = TestUpgrade5.class)
    public List<TestUpgrade5> testUpgrade5List;
}
