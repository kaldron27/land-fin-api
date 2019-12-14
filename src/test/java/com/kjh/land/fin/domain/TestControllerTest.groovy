package com.kjh.land.fin.domain

import spock.lang.Specification

class TestControllerTest extends Specification {
    void setup() {
    }

    void cleanup() {
    }

    def "GetTestData"() {
        given:
            def test = "test"
        when:
            def t = "test".equals(test)
        then:
            t == true
    }
}
