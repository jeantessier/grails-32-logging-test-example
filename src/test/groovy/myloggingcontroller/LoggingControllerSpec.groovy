package myloggingcontroller

import grails.test.mixin.TestFor
import org.slf4j.Logger
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(LoggingController)
class LoggingControllerSpec extends Specification {

    def setup() {
        controller.log = Mock(Logger)
    }

    void "index action writes to logs"() {
        when:
        controller.index()

        then:
        1 * controller.log.error(_)
    }

}
