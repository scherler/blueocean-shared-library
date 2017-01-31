import groovy.xml.MarkupBuilder

def call() {
    def stringWriter = new StringWriter()
    def testResultBuilder = new MarkupBuilder(stringWriter)
    testResultBuilder.testsuites {
        testsuite(name: 'JUnitXmlReporter')
    }
    def xml = stringWriter.toString()
    return xml
}
