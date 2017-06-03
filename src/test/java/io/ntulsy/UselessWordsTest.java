package io.ntulsy;

import org.junit.Test;

import static io.ntulsy.UselessWords.From;
import static io.ntulsy.UselessWords.With;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class UselessWordsTest {

    private DataManager dataManager = new DataManager();
    private DataManager anotherDataManager = new DataManager();

    @Test
    public void exampleTest() throws Exception {
        dataManager.initialize(With(personalData(From(facebookData()))));
        anotherDataManager.initialize(With(personalData(From(twitterData()))));
        assertThat(dataManager, is(not(anotherDataManager)));
    }

    private PersonalData personalData(Object dataStore) {
        return new PersonalData("Bob", 21, dataStore);
    }

    private Object facebookData() {
        // Some facebook data...
        return new Object();
    }

    private Object twitterData() {
        // Some data from Twitter
        return new Object();
    }
}