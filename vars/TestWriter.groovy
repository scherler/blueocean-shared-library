import groovy.xml.MarkupBuilder

def createJunitXml() {
    def stringWriter = new StringWriter()
    def testResultBuilder = new MarkupBuilder(stringWriter)
    testResultBuilder.testsuites {
        testsuite(name: 'JUnitXmlReporter')
    }
    def xml = stringWriter.toString()
    return xml
}
