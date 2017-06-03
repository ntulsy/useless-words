package io.ntulsy;

import java.util.ArrayList;
import java.util.List;

import static io.ntulsy.UselessWords.*;

@SuppressWarnings({"unused", "UnusedAssignment", "FieldCanBeLocal"})
class Example {
    private static DataManager dataManager = new DataManager();
    private static Object anotherObject = new Object();
    private static Object anObject = new Object();
    private static Object aProperty = new Object();
    private static Object retrievedValue = new Object();
    private static List<Object> aList = new ArrayList<Object>();
    private static Object firstCriteria = new Object();
    private static Object secondCriteria = new Object();

    public static void main(String[] args) {

        dataManager.initialize(anObject);
        dataManager.initialize(With(anObject));

        retrievedValue = dataManager.retrieve(anObject, aProperty);
        retrievedValue = dataManager.retrieve(From(anObject), By(aProperty));

        dataManager.merge(anObject, anotherObject);
        dataManager.merge(anObject, To(anotherObject));

        dataManager.update(anObject, anotherObject);
        dataManager.update(anObject, With(anotherObject));

        dataManager.filter(aList, firstCriteria, secondCriteria);
        dataManager.filter(aList, With(firstCriteria), And(secondCriteria));
    }
}
