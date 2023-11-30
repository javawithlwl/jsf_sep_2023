package com.careerit.iplstats.repo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IplStatsRepoTest {

    @Autowired
    private IplStatsRepo iplStatRepo;

    @Test
    void teamExistsTest(){

        boolean actualResult = iplStatRepo.existsByTeamName("CSK");
        boolean expectedResult = true;
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void teamExistsWithInvalidTeamTest(){

        boolean actualResult = iplStatRepo.existsByTeamName("KSC");
        boolean expectedResult = false;
        Assertions.assertEquals(expectedResult, actualResult);
    }


}
